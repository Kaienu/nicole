CREATE TABLE `Cliente` (
  `idCliente` mediumint(8) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(40) NOT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `telefono` int(9) NOT NULL,
  `observaciones` varchar(500) DEFAULT NULL,
  `fechaAlta` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`idCliente`)
);