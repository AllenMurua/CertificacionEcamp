package com.example.certificacionecamp.service;

import com.example.certificacionecamp.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteService {
    Page<Cliente> listarClientes(Pageable pageable);
}
