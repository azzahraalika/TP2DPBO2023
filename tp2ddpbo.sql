-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 12, 2023 at 03:56 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tp2ddpbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(255) NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `tabelagensi`
--

CREATE TABLE `tabelagensi` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `ceo` varchar(255) NOT NULL,
  `tahun` varchar(10) NOT NULL,
  `img` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabelagensi`
--

INSERT INTO `tabelagensi` (`id`, `nama`, `ceo`, `tahun`, `img`) VALUES
(3, 'YG Entertainment', 'Hwang Bokyung', '1996', 'hwang bokyung.jpg'),
(4, 'SM Entertainment', 'Lee Sooman', '1995', 'lee sooman.jpg'),
(5, 'Hybe Entertainment', 'Park Jiwon', '2005', 'park jiwon.jpg'),
(6, 'JYP Entertainment', 'JY Park', '1997', 'jyp.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `tabelidol`
--

CREATE TABLE `tabelidol` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `agensi` varchar(255) DEFAULT NULL,
  `tahun` varchar(11) DEFAULT NULL,
  `member` varchar(11) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabelidol`
--

INSERT INTO `tabelidol` (`id`, `nama`, `agensi`, `tahun`, `member`, `img`) VALUES
(3, 'NCT', 'SM Entertainment', '2016', '23', 'nct.jpeg'),
(4, 'Seventeen', 'Hybe Entertainment', '2015', '13', 'svt.png'),
(6, 'StrayKids', 'JYP Entertainment', '2018', '8', 'skz.jpg'),
(7, 'BigBang', 'YG Entertainment', '2006', '5', 'bigbang.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabelagensi`
--
ALTER TABLE `tabelagensi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabelidol`
--
ALTER TABLE `tabelidol`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabelagensi`
--
ALTER TABLE `tabelagensi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tabelidol`
--
ALTER TABLE `tabelidol`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
