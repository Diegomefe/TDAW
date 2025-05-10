CREATE DATABASE IF NOT EXISTS eventos;
use eventos;

CREATE TABLE reservaciones (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre_cliente VARCHAR(100),
    fecha_entrada DATE,
    fecha_salida DATE
);

INSERT INTO reservaciones (nombre_cliente, fecha_entrada, fecha_salida) VALUES
('Juan Pérez', '2025-05-10', '2025-05-15'),
('María García', '2025-06-01', '2025-06-05'),
('Luis Rodríguez', '2025-05-20', '2025-05-25'),
('Ana Martínez', '2025-07-10', '2025-07-15'),
('Carlos López', '2025-08-01', '2025-08-07');

select * from reservaciones;