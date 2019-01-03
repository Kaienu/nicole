CREATE TABLE `Empleado` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(40) NOT NULL,
  `telefono` int(9) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `fecAlta` datetime DEFAULT CURRENT_TIMESTAMP,
  `fecBaja` datetime DEFAULT NULL,
  `permisos` tinyint(1) DEFAULT '2',
  PRIMARY KEY (`dni`),
  UNIQUE KEY `telefono` (`telefono`),
  UNIQUE KEY `correo` (`correo`)
);