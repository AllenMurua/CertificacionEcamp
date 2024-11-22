package com.example.certificacionecamp.controller;

import com.example.certificacionecamp.dto.FacturaDTO;
import com.example.certificacionecamp.dto.OrdenVentaDTO;
import com.example.certificacionecamp.dto.ProductoDTO;
import com.example.certificacionecamp.model.Cliente;
import com.example.certificacionecamp.model.Factura;
import com.example.certificacionecamp.model.OrdenVenta;
import com.example.certificacionecamp.repositories.ClienteRepository;
import com.example.certificacionecamp.repositories.FacturaRepository;
import com.example.certificacionecamp.repositories.OrdenVentaRepository;
import com.example.certificacionecamp.repositories.ProductoRepository;
import com.example.certificacionecamp.mapper.FacturaMapper;
import com.example.certificacionecamp.mapper.OrdenVentaMapper;
import com.example.certificacionecamp.mapper.ProductoMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/ordenes")
public class MvcController {

    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;
    private final OrdenVentaRepository ordenVentaRepository;
    private final FacturaRepository facturaRepository;

    public MvcController(ClienteRepository clienteRepository, ProductoRepository productoRepository,
                         OrdenVentaRepository ordenVentaRepository, FacturaRepository facturaRepository) {
        this.clienteRepository = clienteRepository;
        this.productoRepository = productoRepository;
        this.ordenVentaRepository = ordenVentaRepository;
        this.facturaRepository = facturaRepository;
    }

    @GetMapping
    public String home(Model model) {
        List<ProductoDTO> productos = productoRepository.findAll().stream()
                .map(ProductoMapper::toDTO)
                .toList();
        model.addAttribute("productos", productos);
        return "index";
    }

    @GetMapping("/clientes")
    public String listarClientes(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Cliente> clientes = clienteRepository.findAll(pageable);
        model.addAttribute("clientes", clientes);
        return "clientes/lista";
    }

    @GetMapping("/ordenes")
    public String listarOrdenes(
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fechaInicio,
            @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fechaFin,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<OrdenVentaDTO> ordenes;
        if (fechaInicio != null && fechaFin != null) {
            ordenes = ordenVentaRepository.findByFiltros(fechaInicio, fechaFin, pageable)
                    .map(OrdenVentaMapper::toDTO);
        } else {
            ordenes = ordenVentaRepository.findAll(pageable)
                    .map(OrdenVentaMapper::toDTO);
        }
        model.addAttribute("ordenes", ordenes);
        model.addAttribute("fechaInicio", fechaInicio);
        model.addAttribute("fechaFin", fechaFin);
        return "ordenes/lista";
    }

    @GetMapping("/ordenes/{id}")
    public String detallesOrden(@PathVariable("id") Long id, Model model) {
        Optional<OrdenVenta> ordenVenta = ordenVentaRepository.findById(id);
        if (ordenVenta.isPresent()) {
            OrdenVentaDTO ordenVentaDTO = OrdenVentaMapper.toDTO(ordenVenta.get());
            model.addAttribute("orden", ordenVentaDTO);
            return "ordenes/detalle";
        } else {
            return "error/404";
        }
    }

    @GetMapping("/facturas")
    public String listarFacturas(
            @RequestParam(required = false) Boolean pagado,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Factura> facturas;
        if (pagado != null) {
            facturas = (Page<Factura>) facturaRepository.findByPagado(pagado, pageable);
        } else {
            facturas = facturaRepository.findAll(pageable);
        }

        Page<FacturaDTO> facturasDTO = facturas.map(FacturaMapper::toDTO);

        model.addAttribute("facturas", facturasDTO);
        model.addAttribute("pagado", pagado);
        return "facturas/lista";
    }

    @GetMapping("/facturas/{id}")
    public String detallesFactura(@PathVariable("id") Long id, Model model) {
        Optional<Factura> factura = facturaRepository.findById(id);
        if (factura.isPresent()) {
            FacturaDTO facturaDTO = FacturaMapper.toDTO(factura.get());
            model.addAttribute("factura", facturaDTO);
            return "facturas/detalle";
        } else {
            return "error/404";
        }
    }
}