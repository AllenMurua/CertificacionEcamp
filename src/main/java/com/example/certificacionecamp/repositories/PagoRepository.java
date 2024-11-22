package com.example.certificacionecamp.repositories;

import com.example.certificacionecamp.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Repository
public interface PagoRepository extends JpaRepository<Pago, Long> {
    @Query(value = """
        SELECT p FROM Pago p 
        WHERE p.fecha BETWEEN :inicio AND :fin 
        ORDER BY p.fecha DESC
    """)
    List<Pago> findByRangoFecha(
            @Param("inicio") LocalDateTime inicio,
            @Param("fin") LocalDateTime fin
    );

    List<Pago> findByFacturaId(Long facturaId);

    @Query("SELECT SUM(p.monto) FROM Pago p WHERE p.factura.id = :facturaId")
    BigDecimal sumMontoByFacturaId(@Param("facturaId") Long facturaId);
}