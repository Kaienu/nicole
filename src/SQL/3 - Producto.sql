CREATE TABLE `Producto` (
  `idProducto` mediumint(8) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `precioUnitario` float NOT NULL,
  `observaciones` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`idProducto`)
);