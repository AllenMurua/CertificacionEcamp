package com.example.certificacionecamp.service;


import com.example.certificacionecamp.dto.OrdenVentaDTO;
import com.example.certificacionecamp.mapper.OrdenVentaMapper;
import com.example.certificacionecamp.repositories.OrdenVentaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrdenVentaServiceImpl implements OrdenVentaService  {

    private final OrdenVentaRepository ordenVentaRepository;

    public OrdenVentaServiceImpl(OrdenVentaRepository ordenVentaRepository) {
        this.ordenVentaRepository = ordenVentaRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<OrdenVentaDTO> buscarOrdenes(OrdenVentaDTO filtro, Pageable pageable) {
        if (filtro.getFechaInicio() != null && filtro.getFechaFin() != null) {
            return ordenVentaRepository.findByFiltros(filtro.getFechaInicio(), filtro.getFechaFin() , pageable)
                    .map(OrdenVentaMapper::toDTO);
        } else {
            return ordenVentaRepository.findAll(pageable)
                    .map(OrdenVentaMapper::toDTO);
        }
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<OrdenVentaDTO> obtenerOrden(Long id) {
        return ordenVentaRepository.findById(id)
                .map(OrdenVentaMapper::toDTO);
    }
}