-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-12-2017 a las 01:39:54
-- Versión del servidor: 10.1.28-MariaDB
-- Versión de PHP: 7.1.10

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
-- Estructura de tabla para la tabla `carreteras`
--

CREATE TABLE `carreteras` (
  `id` int(1) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `valor` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carreteras`
--

INSERT INTO `carreteras` (`id`, `nombre`, `valor`) VALUES
(1, 'Ruta 68', 2300),
(2, 'Ruta del Sol', 2200),
(3, 'Ruta Guardia Vieja', 2100),
(4, 'Troncal Sur', 2000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `rut` int(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `idPersona` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcionespago`
--

CREATE TABLE `opcionespago` (
  `id` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `opcionespago`
--

INSERT INTO `opcionespago` (`id`, `tipo`) VALUES
(1, 'Transferencia'),
(2, 'Pago en linea'),
(3, 'Orden de compra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `opcionesretiro`
--

CREATE TABLE `opcionesretiro` (
  `id` int(1) NOT NULL,
  `tipo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `opcionesretiro`
--

INSERT INTO `opcionesretiro` (`id`, `tipo`) VALUES
(1, 'Oficina'),
(2, 'Envio cliente');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `numeroPedido` int(4) NOT NULL,
  `cantidad` int(3) NOT NULL,
  `opcionPago` int(1) NOT NULL,
  `opcionRetiro` int(1) NOT NULL,
  `rutEmpresa` int(9) NOT NULL,
  `idCarretera` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(3) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `idEmpresa` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carreteras`
--
ALTER TABLE `carreteras`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`rut`),
  ADD UNIQUE KEY `rut` (`rut`),
  ADD KEY `idPersona` (`idPersona`);

--
-- Indices de la tabla `opcionespago`
--
ALTER TABLE `opcionespago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `opcionesretiro`
--
ALTER TABLE `opcionesretiro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`numeroPedido`),
  ADD KEY `idCarretera` (`idCarretera`),
  ADD KEY `opcionPago` (`opcionPago`),
  ADD KEY `opcionRetiro` (`opcionRetiro`),
  ADD KEY `rutEmpresa` (`rutEmpresa`),
  ADD KEY `idCarretera_2` (`idCarretera`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idEmpresa` (`idEmpresa`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `numeroPedido` int(4) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD CONSTRAINT `empresa_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `empresa_ibfk_2` FOREIGN KEY (`rut`) REFERENCES `pedido` (`rutEmpresa`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`opcionRetiro`) REFERENCES `opcionesretiro` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idCarretera`) REFERENCES `carreteras` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `pedido_ibfk_3` FOREIGN KEY (`opcionPago`) REFERENCES `opcionespago` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
