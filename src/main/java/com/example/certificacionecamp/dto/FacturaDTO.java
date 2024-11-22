package com.example.certificacionecamp.dto;

import com.example.certificacionecamp.model.OrdenVenta;
import com.example.certificacionecamp.model.Pago;
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
public class FacturaDTO {
    private Long idFactura;
    private String numeroFactura;
    private LocalDateTime fechaEmision;
    private BigDecimal montoTotal;
    private Boolean pagado;
    private OrdenVenta orden;
    private List<Pago> pagos;

}
