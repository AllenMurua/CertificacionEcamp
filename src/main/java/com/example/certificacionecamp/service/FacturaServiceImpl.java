package com.example.certificacionecamp.service;


import com.example.certificacionecamp.dto.FacturaDTO;
import com.example.certificacionecamp.mapper.FacturaMapper;
import com.example.certificacionecamp.repositories.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    private final FacturaRepository facturaRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }



    @Override
    public Optional<FacturaDTO> obtenerFactura(Long id) {
        return facturaRepository.findById(id)
                .map(FacturaMapper::toDTO);
    }

}