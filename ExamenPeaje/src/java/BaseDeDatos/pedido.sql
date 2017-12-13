-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-12-2017 a las 00:49:50
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `peaje`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `comprador` varchar(25) NOT NULL,
  `tipoRetiro` varchar(25) NOT NULL,
  `tipoPago` varchar(25) NOT NULL,
  `cRutaSol` int(11) NOT NULL,
  `cRuta68` int(11) NOT NULL,
  `cTroncalSur` int(11) NOT NULL,
  `cGuardaVieja` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `idRut` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `comprador`, `tipoRetiro`, `tipoPago`, `cRutaSol`, `cRuta68`, `cTroncalSur`, `cGuardaVieja`, `total`, `idRut`) VALUES
(5, 'Francisco', '2', '2', 1, 1, 1, 1, 8000, 18669347),
(6, 'Rodolfo', '1', '1', 20, 2, 3, 2, 54000, 18669347),
(7, 'Francisco', '1', '1', 0, 1, 3, 2, 12000, 18669347),
(8, 'Francisco', '1', '1', 0, 1, 3, 2, 12000, 18669347),
(9, 'Neil', '2', '1', 0, 2, 5, 3, 20000, 200000000),
(10, 'Neil', '2', '1', 0, 2, 5, 3, 20000, 200000000),
(11, 'Francisco', '2', '1', 1, 1, 1, 1, 8000, 186693477),
(12, 'Francisco', '2', '1', 1, 1, 1, 1, 8000, 18669347),
(13, 'Francisco', '2', '1', 1, 1, 1, 1, 8000, 18669347),
(14, 'Francisco', '2', '1', 1, 1, 1, 1, 8000, 18669347),
(15, 'Francisco', '2', '1', 1, 1, 1, 1, 8000, 18669347),
(16, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(17, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(18, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(19, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(20, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(21, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(22, 'Francisco ', '1', '1', 2, 2, 2, 2, 16000, 200000000),
(23, 'Francisco', 'Transferencia', 'Oficina', 2, 2, 4, 3, 22000, 186693477),
(24, 'Alberto', 'Transferencia', 'Oficina', 3, 3, 3, 3, 24000, 111111111),
(25, 'Alberto', 'Transferencia', 'Oficina', 3, 3, 3, 3, 24000, 111111111),
(26, 'Daniel', 'Transferencia', 'Oficina', 3, 3, 3, 3, 24000, 189412721),
(27, 'Daniel', 'Transferencia', 'Oficina', 3, 3, 3, 3, 24000, 189412721);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
