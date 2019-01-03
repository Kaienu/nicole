CREATE TABLE `Linea` (
  `idLinea` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `idFactura` mediumint(8) unsigned zerofill NOT NULL REFERENCES Factura(idFactura),
  `idProducto` mediumint(8) unsigned zerofill NOT NULL REFERENCES Producto(idProducto),
  `idPromocion` mediumint(8) unsigned zerofill NOT NULL REFERENCES Promocion(idPromocion),
  `cantidad` smallint(6) NOT NULL CHECK (cantidad>0),
  `importeLinea` float NOT NULL,
  PRIMARY KEY (`idLinea`)
);