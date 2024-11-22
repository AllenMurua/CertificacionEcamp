package com.example.certificacionecamp.mapper;

import com.example.certificacionecamp.dto.FacturaDTO;
import com.example.certificacionecamp.model.Factura;
import org.springframework.stereotype.Component;

@Component
public class FacturaMapper {
    public static FacturaDTO toDTO(Factura factura) {
        if (factura == null) {
            return null;
        }

        return FacturaDTO.builder()
                .idFactura(factura.getId())
                .numeroFactura(factura.getNumeroFactura())
                .fechaEmision(factura.getFechaEmision())
                .montoTotal(factura.getMontoTotal())
                .pagado(factura.getPagado())
                .orden(factura.getOrden())
                .pagos(factura.getPagos())
                .build();
    }

    public static Factura toEntity(FacturaDTO facturaDTO) {
        if (facturaDTO == null) {
            return null;
        }

        Factura factura = new Factura();
        factura.setId(facturaDTO.getIdFactura());
        factura.setNumeroFactura(facturaDTO.getNumeroFactura());
        factura.setFechaEmision(facturaDTO.getFechaEmision());
        factura.setMontoTotal(facturaDTO.getMontoTotal());
        factura.setPagado(facturaDTO.getPagado());
        factura.setOrden(facturaDTO.getOrden());
        factura.setPagos(facturaDTO.getPagos());
        return factura;
    }
}