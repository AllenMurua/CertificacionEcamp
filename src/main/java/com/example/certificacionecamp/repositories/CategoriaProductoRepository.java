package com.example.certificacionecamp.repositories;

import com.example.certificacionecamp.model.CategoriaProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoriaProductoRepository extends JpaRepository<CategoriaProducto, Long> {
    Optional<CategoriaProducto> findByNombre(String nombre);
}
