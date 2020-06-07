# TE_practica_5_anuncios
practica 5 patron DAO
![image](https://user-images.githubusercontent.com/66238284/83978531-30001180-a8d6-11ea-9b70-63a52bbe09a6.png)

![image](https://user-images.githubusercontent.com/66238284/83978545-47d79580-a8d6-11ea-8fbe-04c413d8d203.png)

![image](https://user-images.githubusercontent.com/66238284/83978555-5cb42900-a8d6-11ea-9e18-56c4ea64c48a.png)

#BASE_DE_DATOS
-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2020 a las 21:51:09
-- Versión del servidor: 10.1.34-MariaDB
-- Versión de PHP: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `descripcion`, `stock`) VALUES
(1, 'Celular Samsung J7 Pro 2020 en caja', 5800),
(2, 'Laptop  SONY wayos de 15 pulgadas', 555),
(3, 'TV LG 55 PULGADAS', 100),
(4, 'Router de 8 puertos de caja y accesorios', 10),
(5, 'Switsh de multi puerto', 50),
(6, ' Celular Samsumg A70  Prime 2020', 20),
(8, 'Impresora marca epson L3025    2020', 90),
(9, 'Laptop  SONY wayos de 13 pulgadas', 100),
(10, 'Impresora marca canon L3025    2020', 200),
(11, 'Laptop  Toshiba satellite S55-A5169  de 15 pulgadas', 550),
(12, 'Impresora marca SONY L3025-NRT789    2021', 1000);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
