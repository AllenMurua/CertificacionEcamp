package com.example.certificacionecamp.dto;

import com.example.certificacionecamp.model.Cliente;
import com.example.certificacionecamp.model.DetalleOrden;
import com.example.certificacionecamp.model.Factura;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrdenVentaDTO {
    private Long id;
    private String numeroOrden;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Cliente cliente;
    private BigDecimal total;
    private List<DetalleOrden> detalles;
    private Factura factura;

}
