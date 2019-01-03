CREATE TABLE `passwd` (
  `dniEmpleado` varchar(9) NOT NULL,
  `clave` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`dniEmpleado`),
  UNIQUE KEY `dniEmpleado_UNIQUE` (`dniEmpleado`)
);