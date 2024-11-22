-- Clientes (10)
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Juan Pérez', 'juan@email.com', '555-0101', 'Calle 1 #123');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('María García', 'maria@email.com', '555-0102', 'Avenida 2 #456');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Pedro López', 'pedro@email.com', '555-0103', 'Plaza 3 #789');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Ana Martínez', 'ana@email.com', '555-0104', 'Carrera 4 #321');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Carlos Rodríguez', 'carlos@email.com', '555-0105', 'Calle 5 #654');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Laura Sánchez', 'laura@email.com', '555-0106', 'Avenida 6 #987');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Miguel Torres', 'miguel@email.com', '555-0107', 'Plaza 7 #147');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Sofia Ramírez', 'sofia@email.com', '555-0108', 'Carrera 8 #258');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Diego Flores', 'diego@email.com', '555-0109', 'Calle 9 #369');
INSERT INTO cliente (nombre, email, telefono, direccion) VALUES ('Isabel Castro', 'isabel@email.com', '555-0110', 'Avenida 10 #159');

-- Proveedores (5)
INSERT INTO proveedor (nombre, email, telefono, direccion, contacto) VALUES ('Distribuidora ABC', 'abc@prov.com', '555-1001', 'Zona Industrial 1', 'John Doe');
INSERT INTO proveedor (nombre, email, telefono, direccion, contacto) VALUES ('Suministros XYZ', 'xyz@prov.com', '555-1002', 'Zona Industrial 2', 'Jane Smith');
INSERT INTO proveedor (nombre, email, telefono, direccion, contacto) VALUES ('Importadora 123', '123@prov.com', '555-1003', 'Zona Industrial 3', 'Bob Johnson');
INSERT INTO proveedor (nombre, email, telefono, direccion, contacto) VALUES ('Mayorista Global', 'global@prov.com', '555-1004', 'Zona Industrial 4', 'Alice Brown');
INSERT INTO proveedor (nombre, email, telefono, direccion, contacto) VALUES ('Proveedora Local', 'local@prov.com', '555-1005', 'Zona Industrial 5', 'Charlie Wilson');

-- Categorías (6)
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Electrónicos', 'Productos electrónicos y gadgets');
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Hogar', 'Artículos para el hogar');
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Oficina', 'Material de oficina');
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Deportes', 'Equipamiento deportivo');
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Jardín', 'Artículos de jardinería');
INSERT INTO categoria_producto (nombre, descripcion) VALUES ('Mascotas', 'Productos para mascotas');

-- Productos (15)
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Laptop Pro', 'Laptop de última generación', 1299.99, 50, 1, 1);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Smartphone X', 'Teléfono inteligente', 699.99, 100, 1, 1);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Licuadora Power', 'Licuadora de 5 velocidades', 89.99, 30, 2, 2);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Silla Ejecutiva', 'Silla ergonómica de oficina', 199.99, 25, 3, 3);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Balón Profesional', 'Balón de fútbol', 49.99, 200, 4, 4);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Podadora Eléctrica', 'Podadora para jardín', 299.99, 15, 5, 5);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Monitor 4K', 'Monitor de alta resolución', 399.99, 40, 1, 1);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Cafetera', 'Cafetera programable', 79.99, 35, 2, 2);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Escritorio L', 'Escritorio en forma de L', 249.99, 20, 3, 3);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Pesas 10kg', 'Set de pesas', 89.99, 50, 4, 4);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Manguera 50m', 'Manguera de jardín', 39.99, 45, 5, 5);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Tablet Pro', 'Tablet profesional', 599.99, 60, 1, 1);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Aspiradora Robot', 'Aspiradora automática', 399.99, 25, 2, 2);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Impresora Láser', 'Impresora de alta velocidad', 299.99, 30, 3, 3);
INSERT INTO producto (nombre, descripcion, precio_unitario, stock, proveedor_id, categoria_id) VALUES ('Cama Mascota', 'Cama para perro grande', 49.99, 40, 5, 6);

-- Órdenes de Venta (10)
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-001', 1, 2699.97);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-002', 2, 449.95);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-003', 3, 899.97);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-004', 4, 159.98);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-005', 5, 1499.95);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-006', 6, 299.97);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-007', 7, 2199.93);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-008', 8, 749.97);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-009', 9, 1299.96);
INSERT INTO orden_venta (numero_orden, cliente_id, total) VALUES ('ORD-010', 10, 599.97);

-- Detalles de Orden (20)
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (1, 1299.99, 1299.99, 1, 1);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (2, 699.99, 1399.98, 2, 1);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (5, 89.99, 449.95, 3, 2);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 299.99, 899.97, 6, 3);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (2, 79.99, 159.98, 8, 4);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 499.99, 1499.97, 7, 5);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 99.99, 299.97, 10, 6);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 733.31, 2199.93, 12, 7);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 249.99, 749.97, 9, 8);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (4, 324.99, 1299.96, 14, 9);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 199.99, 599.97, 4, 10);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (2, 1299.99, 2599.98, 1, 2);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 699.99, 2099.97, 2, 3);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (4, 699.99, 2799.96, 2, 4);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (1, 399.99, 399.99, 7, 5);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (2, 399.99, 799.98, 7, 6);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (5, 89.99, 449.95, 3, 7);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (3, 89.99, 269.97, 3, 8);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (2, 599.99, 1199.98, 12, 9);
INSERT INTO detalle_orden (cantidad, precio_unitario, subtotal, producto_id, orden_id) VALUES (4, 299.99, 1199.96, 14, 10);

-- Facturas (10)
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-001', 2699.97, true, 1);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-002', 449.95, true, 2);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-003', 899.97, true, 3);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-004', 159.98, false, 4);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-005', 1499.95, true, 5);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-006', 299.97, false, 6);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-007', 2199.93, true, 7);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-008', 749.97, true, 8);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-009', 1299.96, false, 9);
INSERT INTO factura (numero_factura, monto_total, pagado, orden_id) VALUES ('FAC-010', 599.97, true, 10);

-- Pagos (15)
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (1500.00, 'Tarjeta de Crédito', 1);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (1199.97, 'Transferencia', 1);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (449.95, 'Efectivo', 2);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (899.97, 'Tarjeta de Débito', 3);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (1499.95, 'Transferencia', 5);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (1500.00, 'Tarjeta de Crédito', 7);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (699.93, 'Efectivo', 7);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (749.97, 'Transferencia', 8);
INSERT INTO pago (monto, metodo_pago, factura_id) VALUES (599.97, 'Tarjeta de Débito', 10);