package com.example.certificacionecamp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "factura")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_factura", nullable = false, unique = true, length = 50)
    private String numeroFactura;

    @Column(name = "fecha_emision")
    private LocalDateTime fechaEmision;

    @Column(name = "monto_total", nullable = false, precision = 10, scale = 2)
    private BigDecimal montoTotal;

    @Column(name = "pagado")
    private Boolean pagado;

    @OneToOne
    @JoinColumn(name = "orden_id")
    private OrdenVenta orden;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<Pago> pagos;
}