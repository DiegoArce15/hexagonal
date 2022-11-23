-- Creación de la tabla PRICES
CREATE TABLE RATES (
    RATES_ID SERIAL NOT NULL PRIMARY KEY,
    BRAND_ID INT,
    START_DATE TIMESTAMP,
    END_DATE TIMESTAMP,
    PRICE_LIST INT,
    PRODUCT_ID INT,
    PRIORITY INT,
    PRICE NUMERIC(20, 2),
    CURR VARCHAR(3)
);

-- Añadir comentarios a las columnas
COMMENT ON COLUMN RATES.PRICE_ID IS 'Identificador unico de la tabla price';
COMMENT ON COLUMN RATES.BRAND_ID IS 'Foreign key de la cadena del grupo';
COMMENT ON COLUMN RATES.START_DATE IS 'Inicio de la tarifa indicada';
COMMENT ON COLUMN RATES.END_DATE IS 'Fin de la tarifa indicada';
COMMENT ON COLUMN RATES.PRICE_LIST IS 'Identificador de la tarifa de precios aplicable';
COMMENT ON COLUMN RATES.PRODUCT_ID IS 'Identificador código de producto';
COMMENT ON COLUMN RATES.PRIORITY IS 'Desambiguador de aplicación de precios';
COMMENT ON COLUMN RATES.PRICE IS 'Precio final de venta';
COMMENT ON COLUMN RATES.CURR IS 'ISO de la moneda';