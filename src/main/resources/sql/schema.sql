CREATE TABLE "cliente" (
  "id" SERIAL PRIMARY KEY,
  "nombre" VARCHAR(100) NOT NULL,
  "email" VARCHAR(100) UNIQUE NOT NULL,
  "telefono" VARCHAR(15),
  "direccion" VARCHAR(255),
  "fecha_registro" TIMESTAMP DEFAULT (NOW()),
  "activo" BOOLEAN DEFAULT true
);

CREATE TABLE "proveedor" (
  "id" SERIAL PRIMARY KEY,
  "nombre" VARCHAR(100) NOT NULL,
  "email" VARCHAR(100),
  "telefono" VARCHAR(15),
  "direccion" VARCHAR(255),
  "contacto" VARCHAR(100)
);

CREATE TABLE "categoria_producto" (
  "id" SERIAL PRIMARY KEY,
  "nombre" VARCHAR(100) NOT NULL,
  "descripcion" TEXT
);

CREATE TABLE "producto" (
  "id" SERIAL PRIMARY KEY,
  "nombre" VARCHAR(100) NOT NULL,
  "descripcion" TEXT,
  "precio_unitario" NUMERIC(10,2) NOT NULL,
  "stock" INTEGER NOT NULL DEFAULT 0,
  "fecha_creacion" TIMESTAMP DEFAULT (NOW()),
  "proveedor_id" INT REFERENCES "proveedor" ("id"),
  "categoria_id" INT REFERENCES "categoria_producto" ("id")
);

CREATE TABLE "orden_venta" (
  "id" SERIAL PRIMARY KEY,
  "numero_orden" VARCHAR(50) UNIQUE NOT NULL,
  "fecha" TIMESTAMP DEFAULT (NOW()),
  "cliente_id" INT REFERENCES "cliente" ("id"),
  "total" NUMERIC(10,2) NOT NULL DEFAULT 0
);

CREATE TABLE "detalle_orden" (
  "id" SERIAL PRIMARY KEY,
  "cantidad" INT NOT NULL,
  "precio_unitario" NUMERIC(10,2) NOT NULL,
  "subtotal" NUMERIC(10,2),
  "producto_id" INT REFERENCES "producto" ("id"),
  "orden_id" INT REFERENCES "orden_venta" ("id") ON DELETE CASCADE
);

CREATE TABLE "factura" (
  "id" SERIAL PRIMARY KEY,
  "numero_factura" VARCHAR(50) UNIQUE NOT NULL,
  "fecha_emision" TIMESTAMP DEFAULT (NOW()),
  "monto_total" NUMERIC(10,2) NOT NULL,
  "pagado" BOOLEAN DEFAULT false,
  "orden_id" INT REFERENCES "orden_venta" ("id") ON DELETE CASCADE
);

CREATE TABLE "pago" (
  "id" SERIAL PRIMARY KEY,
  "monto" NUMERIC(10,2) NOT NULL,
  "fecha" TIMESTAMP DEFAULT (NOW()),
  "metodo_pago" VARCHAR(50),
  "factura_id" INT REFERENCES "factura" ("id") ON DELETE CASCADE
);