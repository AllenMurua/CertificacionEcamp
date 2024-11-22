package com.example.certificacionecamp.repositories;

import com.example.certificacionecamp.model.OrdenVenta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface OrdenVentaRepository extends JpaRepository<OrdenVenta, Long> {

    @Query(value = """
            SELECT o 
            FROM OrdenVenta o
            JOIN FETCH o.factura f
            WHERE (:fechaInicio IS NULL OR o.fecha >= :fechaInicio)
            AND (:fechaFin IS NULL OR o.fecha <= :fechaFin)
            AND (:estado IS NULL OR (CASE 
                WHEN :estado = 'PAGADA' THEN f.pagado = true
                WHEN :estado = 'PENDIENTE' THEN f.pagado = false
                ELSE true END))
            """,
            countQuery = """
            SELECT COUNT(o)
            FROM OrdenVenta o
            WHERE (:fechaInicio IS NULL OR o.fecha >= :fechaInicio)
            AND (:fechaFin IS NULL OR o.fecha <= :fechaFin)
            AND (:estado IS NULL OR (CASE 
                WHEN :estado = 'PAGADA' THEN f.pagado = true
                WHEN :estado = 'PENDIENTE' THEN f.pagado = false
                ELSE true END))
            """,
            nativeQuery = true
    )
    Page<OrdenVenta> findByFiltros(
            @Param("fechaInicio") LocalDateTime fechaInicio,
            @Param("fechaFin") LocalDateTime fechaFin,
            Pageable pageable
    );
}
