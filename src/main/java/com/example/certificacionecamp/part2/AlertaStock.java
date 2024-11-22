package com.example.certificacionecamp.part2;


import com.example.certificacionecamp.model.CategoriaProducto;
import com.example.certificacionecamp.model.Producto;

import java.time.LocalDate;
import java.util.List;

public class AlertaStock {
    public static void verificarStockCritico(List<Producto> productos, Long ProductoId, List<CategoriaProducto> categoriaProducto) {
        Long id = 0L;
        int stockCritico=0;
        for (Producto producto : productos) {
            if (producto.getId() == ProductoId) {
                producto.getCategoria();
                for (CategoriaProducto categoria : categoriaProducto) {
                    if (categoria.getNombre().equals("Electronicos")) {
                        stockCritico= 20;
                    }else stockCritico= 10;

                }
                id = producto.getId();
                break;
            }
        }
        Producto producto= productos.get(Math.toIntExact(id));

        if (producto.getStock()<30) {
            System.out.println("!Alerta de Stock¡");
            System.out.println("------------------------");
            System.out.println("Producto:" +producto.getNombre() );
            System.out.println("Stock:" +producto.getStock());
            System.out.println("Stock minimo; " + stockCritico);
            if (producto.getStock()>stockCritico){
                System.out.println("No se requiere reposicion");
            }else System.out.println("Se Requiere Reposicion");
        }
    }
}
