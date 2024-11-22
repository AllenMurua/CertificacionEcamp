package com.example.certificacionecamp.mapper;

import com.example.certificacionecamp.dto.DetalleOrdenDTO;
import com.example.certificacionecamp.model.DetalleOrden;
import org.springframework.stereotype.Component;

@Component
public class DetalleOrdenMapper {
    public static DetalleOrdenDTO toDTO(DetalleOrden detalleOrden) {
        if (detalleOrden == null) {
            return null;
        }

        return DetalleOrdenDTO.builder()
                .idDetalleOrden(detalleOrden.getId())
                .cantidad(detalleOrden.getCantidad())
                .precioUnitario(detalleOrden.getPrecioUnitario())
                .subTotal(detalleOrden.getSubtotal())
                .producto(detalleOrden.getProducto())
                .ordenVenta(detalleOrden.getOrden())
                .build();
    }

    public static DetalleOrden toEntity(DetalleOrdenDTO detalleOrdenDTO) {
        if (detalleOrdenDTO == null) {
            return null;
        }

        DetalleOrden detalleOrden = new DetalleOrden();
        detalleOrden.setId(detalleOrdenDTO.getIdDetalleOrden());
        detalleOrden.setCantidad(detalleOrdenDTO.getCantidad());
        detalleOrden.setPrecioUnitario(detalleOrdenDTO.getPrecioUnitario());
        detalleOrden.setSubtotal(detalleOrdenDTO.getSubTotal());
        detalleOrden.setProducto(detalleOrdenDTO.getProducto());
        detalleOrden.setOrden(detalleOrdenDTO.getOrdenVenta());
        return detalleOrden;
    }
}
