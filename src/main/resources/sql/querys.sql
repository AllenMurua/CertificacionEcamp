
/*1. Obtener el total de ventas por cliente en el último mes, mostrando solo
 aquellos que han comprado más de $1000 en total, ordenados por monto de
 mayor a menor.
*/
SELECT c.nombre, 1, ov.total from cliente c
Inner Join public.orden_venta ov on c.id = ov.cliente_id
WHERE total > 1000;
/*. Listar los productos con stock crítico (menor a 30 unidades) junto con su
 proveedor y categoría.*/
SELECT p.nombre, p.stock, p2.nombre, p2.contacto, cp.nombre from producto p
Inner Join public.categoria_producto cp on p.categoria_id = cp.id
INNER JOIN public.proveedor p2 on p2.id = p.proveedor_id
WHERE stock<30;
/*.3. Mostrar las facturas pendientes de pago, incluyendo datos del cliente y el
 total adeudado.*/
SELECT f.fecha_emision, f.monto_total, c.nombre FROM orden_venta ov
inner join public.cliente c on c.id = ov.cliente_id
INNER JOIN public.factura f on ov.id = f.orden_id
WHERE pagado=false;
/*.4.Obtener los 5 productos más vendidos, mostrando la cantidad total
 vendida y el monto total generado*/
SELECT p.nombre, cp.nombre AS categoria, sum(d.cantidad) AS cantidad_total, SUM(d.subtotal) AS monto_total
from producto p
    INNER JOIN public.detalle_orden d on p.id = d.producto_id
    INNER JOIN public.categoria_producto cp ON cp.id = p.categoria_id
GROUP BY p.nombre, cp.nombre
order by cantidad_total DESC;

/*.5.
 Mostrar el resumen de pagos por método de pago del último mes,
 incluyendo el número de transacciones y el monto total por cada método.*/
SELECT p.metodo_pago, COUNT(p.metodo_pago) AS numero_transacciones, SUM(f.monto_total) AS monto_total, AVG(f.monto_total)
from pago p
 INNER JOIN public.factura f on f.id = p.factura_id
group by p.metodo_pago;

SELECT * from categoria_producto;

