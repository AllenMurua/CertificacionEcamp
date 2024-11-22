package com.example.certificacionecamp.service;


import com.example.certificacionecamp.model.Cliente;
import com.example.certificacionecamp.repositories.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Page<Cliente> listarClientes(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }
}