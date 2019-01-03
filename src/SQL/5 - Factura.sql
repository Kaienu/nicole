CREATE TABLE `Factura` (
  `idFactura` mediumint(8) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `idCliente` mediumint(8) unsigned zerofill NOT NULL REFERENCES Cliente(idCliente) ON DELETE SET NULL,
  `dniEmpleado` varchar(9) NOT NULL REFERENCES Empleado(dni) ON UPDATE CASCADE,
  `fecha` datetime DEFAULT CURRENT_TIMESTAMP,
  `importe` float NOT NULL,
  PRIMARY KEY (`idFactura`)
);