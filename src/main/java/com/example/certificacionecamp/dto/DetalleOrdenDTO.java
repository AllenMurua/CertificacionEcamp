package com.example.certificacionecamp.dto;

import com.example.certificacionecamp.model.Cliente;
import com.example.certificacionecamp.model.OrdenVenta;
import com.example.certificacionecamp.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrdenDTO {
    private Long idDetalleOrden;
    private int cantidad;
    private BigDecimal precioUnitario;
    private BigDecimal subTotal;
    private Producto producto;
    private OrdenVenta ordenVenta;
}
