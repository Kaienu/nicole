CREATE TABLE `Promocion` (
  `idPromocion` mediumint(8) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `porcenProm` tinyint(4) NOT NULL,
  `denominacion` varchar(100) NOT NULL,
  PRIMARY KEY (`idPromocion`)
);