package com.example.certificacionecamp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pago")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal monto;

    private LocalDateTime fecha;

    @Column(name = "metodo_pago", length = 50)
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "factura_id", nullable = false)
    private Factura factura;
}