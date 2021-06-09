-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 09, 2021 at 04:11 PM
-- Server version: 5.7.31
-- PHP Version: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `govipola`
--

-- --------------------------------------------------------

--
-- Table structure for table `farmer`
--

DROP TABLE IF EXISTS `farmer`;
CREATE TABLE IF NOT EXISTS `farmer` (
  `Farmer_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Usr_Name` varchar(20) NOT NULL,
  `No` varchar(10) NOT NULL,
  `Street` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `Rate` int(1) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  PRIMARY KEY (`Farmer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `farmer`
--

INSERT INTO `farmer` (`Farmer_ID`, `Usr_Name`, `No`, `Street`, `City`, `Rate`, `Password`, `Email`) VALUES
(1, 'Lasith', '23', 'hree', 'ciryt', 2, 'hgdtefr', 'lasjd@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `farmertpno`
--

DROP TABLE IF EXISTS `farmertpno`;
CREATE TABLE IF NOT EXISTS `farmertpno` (
  `Farmer_ID` int(11) NOT NULL,
  `Tel_No` int(10) NOT NULL,
  KEY `Farmer_ID` (`Farmer_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
CREATE TABLE IF NOT EXISTS `post` (
  `Post_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ItemName` varchar(30) NOT NULL,
  `Valid_Till` date NOT NULL,
  `Qty` varchar(5) NOT NULL,
  `Price` double NOT NULL,
  `Farmer_ID` int(11) NOT NULL,
  PRIMARY KEY (`Post_ID`),
  KEY `Farmer_ID` (`Farmer_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`Post_ID`, `ItemName`, `Valid_Till`, `Qty`, `Price`, `Farmer_ID`) VALUES
(1, 'Carrot', '2021-06-10', '233', 50.52, 1);

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
CREATE TABLE IF NOT EXISTS `request` (
  `Req_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Item` varchar(30) NOT NULL,
  `Qty` varchar(5) NOT NULL,
  `Negotiated_Price` double NOT NULL,
  `Date` date NOT NULL,
  `Seller_ID` int(11) NOT NULL,
  `Post_ID` int(11) NOT NULL,
  PRIMARY KEY (`Req_ID`),
  KEY `Seller_ID` (`Seller_ID`),
  KEY `Post_ID` (`Post_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `retail_seller`
--

DROP TABLE IF EXISTS `retail_seller`;
CREATE TABLE IF NOT EXISTS `retail_seller` (
  `Seller_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Password` varchar(30) NOT NULL,
  `Usr_Name` varchar(20) NOT NULL,
  `No` varchar(10) NOT NULL,
  `Street` varchar(50) NOT NULL,
  `City` varchar(50) NOT NULL,
  `Rate` int(1) NOT NULL,
  `Email` varchar(20) NOT NULL,
  PRIMARY KEY (`Seller_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `retail_sellertpno`
--

DROP TABLE IF EXISTS `retail_sellertpno`;
CREATE TABLE IF NOT EXISTS `retail_sellertpno` (
  `Seller_ID` int(11) NOT NULL,
  `Tel_No` int(10) NOT NULL,
  KEY `Seller_ID` (`Seller_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `farmertpno`
--
ALTER TABLE `farmertpno`
  ADD CONSTRAINT `farmertpno_ibfk_1` FOREIGN KEY (`Farmer_ID`) REFERENCES `farmer` (`Farmer_ID`);

--
-- Constraints for table `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `post_ibfk_1` FOREIGN KEY (`Farmer_ID`) REFERENCES `farmer` (`Farmer_ID`);

--
-- Constraints for table `request`
--
ALTER TABLE `request`
  ADD CONSTRAINT `request_ibfk_1` FOREIGN KEY (`Seller_ID`) REFERENCES `retail_seller` (`Seller_ID`),
  ADD CONSTRAINT `request_ibfk_2` FOREIGN KEY (`Post_ID`) REFERENCES `post` (`Post_ID`);

--
-- Constraints for table `retail_sellertpno`
--
ALTER TABLE `retail_sellertpno`
  ADD CONSTRAINT `retail_sellertpno_ibfk_1` FOREIGN KEY (`Seller_ID`) REFERENCES `retail_seller` (`Seller_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
