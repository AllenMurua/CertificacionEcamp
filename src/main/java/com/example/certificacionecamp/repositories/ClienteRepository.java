package com.example.certificacionecamp.repositories;

import com.example.certificacionecamp.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    @Query(value = "SELECT c FROM Cliente c WHERE c_activo = true", nativeQuery = true)
    List<Cliente> findAllActive();

    List<Cliente> findByNombre(String nombre);
    Optional<Cliente> findByEmail(String email);
}