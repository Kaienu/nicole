CREATE TABLE Linea
(
idLinea INT ZEROFILL PRIMARY KEY AUTO_INCREMENT,
idFactura MEDIUMINT NOT NULL REFERENCES Factura(idFactura),
idProducto MEDIUMINT NOT NULL REFERENCES Producto(idProducto),
idPromocion MEDIUMINT NOT NULL REFERENCES Promocion(idPromocion),
cantidad SMALLINT NOT NULL CHECK (cantidad>0),
importeLinea SMALLINT NOT NULL
);