package com.example.certificacionecamp.service;

import com.example.certificacionecamp.dto.OrdenVentaDTO;
import com.example.certificacionecamp.model.OrdenVenta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface OrdenVentaService {
    Page<OrdenVentaDTO> buscarOrdenes(OrdenVentaDTO filtro, Pageable pageable);
    Optional<OrdenVentaDTO> obtenerOrden(Long id);

}
