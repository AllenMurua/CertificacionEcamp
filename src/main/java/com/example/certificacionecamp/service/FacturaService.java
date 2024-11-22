package com.example.certificacionecamp.service;

import com.example.certificacionecamp.dto.FacturaDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface FacturaService {
    Optional<FacturaDTO> obtenerFactura(Long id);
}
