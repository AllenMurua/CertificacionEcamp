package com.example.certificacionecamp.mapper;

import com.example.certificacionecamp.dto.ProductoDTO;
import com.example.certificacionecamp.model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoMapper {
    public static ProductoDTO toDTO(Producto producto) {
        if (producto == null) {
            return null;
        }

        return ProductoDTO.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .descripcion(producto.getDescripcion())
                .precioUnitario(producto.getPrecioUnitario())
                .stock(producto.getStock())
                .build();
    }

    public static Producto toEntity(ProductoDTO productoDTO) {
        if (productoDTO == null) {
            return null;
        }

        Producto producto = new Producto();
        producto.setId(productoDTO.getId());
        producto.setNombre(productoDTO.getNombre());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setPrecioUnitario(productoDTO.getPrecioUnitario());
        producto.setStock(productoDTO.getStock());
        return producto;
    }
}