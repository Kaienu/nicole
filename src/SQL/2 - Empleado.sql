CREATE TABLE Empleado
(
dni VARCHAR (9) PRIMARY KEY,
nombre VARCHAR (25) NOT NULL,
apellidos VARCHAR (40) NOT NULL,
telefono INTEGER (9) UNIQUE,
correo VARCHAR (100) UNIQUE
);