CREATE TABLE Cliente
(
idCliente MEDIUMINT ZEROFILL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (25) NOT NULL,
apellidos VARCHAR (40) NOT NULL,
correo VARCHAR (100),
telefono INTEGER (9) NOT NULL
);