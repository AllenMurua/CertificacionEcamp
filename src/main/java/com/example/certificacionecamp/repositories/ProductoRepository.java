package com.example.certificacionecamp.repositories;

import com.example.certificacionecamp.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query("SELECT p FROM Producto p WHERE p.stock < :minStock")
    List<Producto> findLowStock(@Param("minStock") Integer minStock);

    List<Producto> findByCategoriaId(Long categoriaId);

    @Query("SELECT p FROM Producto p WHERE p.precioUnitario BETWEEN :minPrecio AND :maxPrecio")
    List<Producto> findByPrecioRange(
            @Param("minPrecio") BigDecimal minPrecio,
            @Param("maxPrecio") BigDecimal maxPrecio
    );
}