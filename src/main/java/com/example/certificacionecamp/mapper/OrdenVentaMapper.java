package com.example.certificacionecamp.mapper;

import com.example.certificacionecamp.dto.OrdenVentaDTO;
import com.example.certificacionecamp.model.OrdenVenta;
import org.springframework.stereotype.Component;

@Component
public class OrdenVentaMapper {
    public static OrdenVentaDTO toDTO(OrdenVenta ordenVenta) {
        if (ordenVenta == null) {
            return null;
        }

        return OrdenVentaDTO.builder()
                .id(ordenVenta.getId())
                .numeroOrden(ordenVenta.getNumeroOrden())
                .fechaInicio(ordenVenta.getFecha())
                .fechaFin(ordenVenta.getFecha())
                .cliente(ordenVenta.getCliente())
                .total(ordenVenta.getTotal())
                .detalles(ordenVenta.getDetalles())
                .factura(ordenVenta.getFactura())
                .build();
    }

    public static OrdenVenta toEntity(OrdenVentaDTO ordenVentaDTO) {
        if (ordenVentaDTO == null) {
            return null;
        }

        OrdenVenta ordenVenta = new OrdenVenta();
        ordenVenta.setId(ordenVentaDTO.getId());
        ordenVenta.setNumeroOrden(ordenVentaDTO.getNumeroOrden());
        ordenVenta.setFecha(ordenVentaDTO.getFechaInicio());
        ordenVenta.setFecha(ordenVentaDTO.getFechaFin());
        ordenVenta.setCliente(ordenVentaDTO.getCliente());
        ordenVenta.setTotal(ordenVentaDTO.getTotal());
        ordenVenta.setDetalles(ordenVentaDTO.getDetalles());
        ordenVenta.setFactura(ordenVentaDTO.getFactura());
        return ordenVenta;
    }
}
