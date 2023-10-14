-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 14, 2023 at 12:38 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mydatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `practice`
--

CREATE TABLE `practice` (
  `id` int(11) NOT NULL,
  `time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL,
  `req` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `practice`
--

INSERT INTO `practice` (`id`, `time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `req`) VALUES
(1, '7:30-8:30', 'Jecham(Rey)', 'Jecham(Rey)', 'Jecham(English)', '', '', 'jecham'),
(2, '8:30-9:30', 'Jecham(Filipino)', '', '', '', '', ' '),
(3, '9:30-10:30', 'Jecham(AP)', '', '', '', '', NULL),
(4, '10:50-11:50', 'Jecham(Makabayan)', '', '', '', '', NULL),
(5, '1:00-2:00', 'Jecham(Rey)', '', '', '', '', NULL),
(6, '2:00-3:00', 'Jecham(Rey)', '', '', '', '', NULL),
(7, '3:00-4:00', 'Jecham(Calculus)', '', 'Cabusog(Jecham)', '', '', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tb_accounts`
--

CREATE TABLE `tb_accounts` (
  `acc_id` int(11) NOT NULL,
  `acc_fname` varchar(100) NOT NULL,
  `acc_lname` varchar(100) NOT NULL,
  `acc_username` varchar(100) NOT NULL,
  `acc_password` varchar(100) NOT NULL,
  `acc_code` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_accounts`
--

INSERT INTO `tb_accounts` (`acc_id`, `acc_fname`, `acc_lname`, `acc_username`, `acc_password`, `acc_code`) VALUES
(1, 'Jecham', 'Cabusog', 'jecham', 'cabusog', 95303),
(2, 'kim', 'garbo', 'kimoy', 'kimoyy', 2392),
(3, 'angely', 'bonggay', 'ange', 'bongs', 35621);

-- --------------------------------------------------------

--
-- Table structure for table `tb_archive_day`
--

CREATE TABLE `tb_archive_day` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldday` varchar(100) DEFAULT NULL,
  `req_newday` varchar(100) DEFAULT NULL,
  `req_reasonmsg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_archive_subject`
--

CREATE TABLE `tb_archive_subject` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldsubject` varchar(100) DEFAULT NULL,
  `req_newsubject` varchar(100) DEFAULT NULL,
  `req_reasonmsg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_archive_time`
--

CREATE TABLE `tb_archive_time` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldtime` varchar(100) DEFAULT NULL,
  `req_newtime` varchar(100) DEFAULT NULL,
  `req_reasonmsg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_archive_time`
--

INSERT INTO `tb_archive_time` (`req_id`, `req_fname`, `req_lname`, `req_oldtime`, `req_newtime`, `req_reasonmsg`) VALUES
(1, 'Jecham Rey', 'Cabusog', '7:30-8:30', '9:30-10:30', 'Wala lang buot kag mag change ko?');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g7generosity`
--

CREATE TABLE `tb_g7generosity` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) DEFAULT NULL,
  `monday` varchar(100) DEFAULT NULL,
  `tuesday` varchar(100) DEFAULT NULL,
  `wednesday` varchar(100) DEFAULT NULL,
  `thursday` varchar(100) DEFAULT NULL,
  `friday` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g7generosity`
--

INSERT INTO `tb_g7generosity` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', 'Jecham(Calculus)', NULL, NULL, NULL, NULL),
(2, '8:30-9:30', 'adwdawd(awdwadaw)', NULL, NULL, NULL, NULL),
(3, '9:30-10:30', NULL, NULL, NULL, NULL, NULL),
(4, '10:50-11:50', NULL, NULL, NULL, NULL, NULL),
(5, '1:00-2:00', NULL, NULL, NULL, NULL, NULL),
(6, '2:00-3:00', NULL, NULL, NULL, NULL, NULL),
(7, '3:00-4:00', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tb_g7honesty`
--

CREATE TABLE `tb_g7honesty` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g7honesty`
--

INSERT INTO `tb_g7honesty` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g7obedience`
--

CREATE TABLE `tb_g7obedience` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g7obedience`
--

INSERT INTO `tb_g7obedience` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g7service`
--

CREATE TABLE `tb_g7service` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g7service`
--

INSERT INTO `tb_g7service` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g7simplicity`
--

CREATE TABLE `tb_g7simplicity` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g7simplicity`
--

INSERT INTO `tb_g7simplicity` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g8humility`
--

CREATE TABLE `tb_g8humility` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g8humility`
--

INSERT INTO `tb_g8humility` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g8justice`
--

CREATE TABLE `tb_g8justice` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g8justice`
--

INSERT INTO `tb_g8justice` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g8mercy`
--

CREATE TABLE `tb_g8mercy` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g8mercy`
--

INSERT INTO `tb_g8mercy` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g8produce`
--

CREATE TABLE `tb_g8produce` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g8produce`
--

INSERT INTO `tb_g8produce` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g8wisdom`
--

CREATE TABLE `tb_g8wisdom` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g8wisdom`
--

INSERT INTO `tb_g8wisdom` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g9compassion`
--

CREATE TABLE `tb_g9compassion` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g9compassion`
--

INSERT INTO `tb_g9compassion` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g9courage`
--

CREATE TABLE `tb_g9courage` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g9courage`
--

INSERT INTO `tb_g9courage` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g9fortitude`
--

CREATE TABLE `tb_g9fortitude` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g9fortitude`
--

INSERT INTO `tb_g9fortitude` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g9modesty`
--

CREATE TABLE `tb_g9modesty` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g9modesty`
--

INSERT INTO `tb_g9modesty` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g9perseverance`
--

CREATE TABLE `tb_g9perseverance` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g9perseverance`
--

INSERT INTO `tb_g9perseverance` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g10charity`
--

CREATE TABLE `tb_g10charity` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g10charity`
--

INSERT INTO `tb_g10charity` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g10faith`
--

CREATE TABLE `tb_g10faith` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g10faith`
--

INSERT INTO `tb_g10faith` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g10hope`
--

CREATE TABLE `tb_g10hope` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g10hope`
--

INSERT INTO `tb_g10hope` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_g10loyalty`
--

CREATE TABLE `tb_g10loyalty` (
  `sched_id` int(11) NOT NULL,
  `sched_time` varchar(100) NOT NULL,
  `monday` varchar(100) NOT NULL,
  `tuesday` varchar(100) NOT NULL,
  `wednesday` varchar(100) NOT NULL,
  `thursday` varchar(100) NOT NULL,
  `friday` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_g10loyalty`
--

INSERT INTO `tb_g10loyalty` (`sched_id`, `sched_time`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`) VALUES
(1, '7:30-8:30', '', '', '', '', ''),
(2, '8:30-9:30', '', '', '', '', ''),
(3, '9:30-10:30', '', '', '', '', ''),
(4, '10:50-11:50', '', '', '', '', ''),
(5, '1:00-2:00', '', '', '', '', ''),
(6, '2:00-3:00', '', '', '', '', ''),
(7, '3:00-4:00', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `tb_reqday`
--

CREATE TABLE `tb_reqday` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldday` varchar(100) DEFAULT NULL,
  `req_newday` varchar(100) DEFAULT NULL,
  `req_reasonmsg` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_reqsubject`
--

CREATE TABLE `tb_reqsubject` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldsubject` varchar(200) DEFAULT NULL,
  `req_newsubject` varchar(200) DEFAULT NULL,
  `req_reasonmsg` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_reqtime`
--

CREATE TABLE `tb_reqtime` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(100) DEFAULT NULL,
  `req_lname` varchar(100) DEFAULT NULL,
  `req_oldtime` varchar(100) DEFAULT NULL,
  `req_newtime` varchar(100) DEFAULT NULL,
  `req_reasonmsg` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_sched_request`
--

CREATE TABLE `tb_sched_request` (
  `req_id` int(11) NOT NULL,
  `req_fname` varchar(250) NOT NULL,
  `req_lname` varchar(250) NOT NULL,
  `req_message` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `userdata`
--

CREATE TABLE `userdata` (
  `user_ID` int(11) NOT NULL,
  `user_fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `user_code` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userdata`
--

INSERT INTO `userdata` (`user_ID`, `user_fullname`, `username`, `password`, `user_code`) VALUES
(1, 'Jecham', 'jecham', '1234', 'ohyeah22'),
(2, 'Rey', 'rey', '0000', ''),
(3, 'auo', 'cbsg', '123', ''),
(4, 'Cabusog1', 'Cabusog2', 'Cabusog3', ''),
(5, 'Cabs1', 'Cabs2', 'Cabs3', ''),
(6, 'Jecham', 'Username', 'Password', ''),
(7, 'User', 'User', 'User', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `practice`
--
ALTER TABLE `practice`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tb_accounts`
--
ALTER TABLE `tb_accounts`
  ADD PRIMARY KEY (`acc_id`);

--
-- Indexes for table `tb_archive_day`
--
ALTER TABLE `tb_archive_day`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_archive_subject`
--
ALTER TABLE `tb_archive_subject`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_archive_time`
--
ALTER TABLE `tb_archive_time`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_g7generosity`
--
ALTER TABLE `tb_g7generosity`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g7honesty`
--
ALTER TABLE `tb_g7honesty`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g7obedience`
--
ALTER TABLE `tb_g7obedience`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g7service`
--
ALTER TABLE `tb_g7service`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g7simplicity`
--
ALTER TABLE `tb_g7simplicity`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g8humility`
--
ALTER TABLE `tb_g8humility`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g8justice`
--
ALTER TABLE `tb_g8justice`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g8mercy`
--
ALTER TABLE `tb_g8mercy`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g8produce`
--
ALTER TABLE `tb_g8produce`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g8wisdom`
--
ALTER TABLE `tb_g8wisdom`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g9compassion`
--
ALTER TABLE `tb_g9compassion`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g9courage`
--
ALTER TABLE `tb_g9courage`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g9fortitude`
--
ALTER TABLE `tb_g9fortitude`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g9modesty`
--
ALTER TABLE `tb_g9modesty`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g9perseverance`
--
ALTER TABLE `tb_g9perseverance`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g10charity`
--
ALTER TABLE `tb_g10charity`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g10faith`
--
ALTER TABLE `tb_g10faith`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g10hope`
--
ALTER TABLE `tb_g10hope`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_g10loyalty`
--
ALTER TABLE `tb_g10loyalty`
  ADD PRIMARY KEY (`sched_id`);

--
-- Indexes for table `tb_reqday`
--
ALTER TABLE `tb_reqday`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_reqsubject`
--
ALTER TABLE `tb_reqsubject`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_reqtime`
--
ALTER TABLE `tb_reqtime`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `tb_sched_request`
--
ALTER TABLE `tb_sched_request`
  ADD PRIMARY KEY (`req_id`);

--
-- Indexes for table `userdata`
--
ALTER TABLE `userdata`
  ADD PRIMARY KEY (`user_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `practice`
--
ALTER TABLE `practice`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_accounts`
--
ALTER TABLE `tb_accounts`
  MODIFY `acc_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_archive_day`
--
ALTER TABLE `tb_archive_day`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_archive_subject`
--
ALTER TABLE `tb_archive_subject`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_archive_time`
--
ALTER TABLE `tb_archive_time`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_g7generosity`
--
ALTER TABLE `tb_g7generosity`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g7honesty`
--
ALTER TABLE `tb_g7honesty`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g7obedience`
--
ALTER TABLE `tb_g7obedience`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g7service`
--
ALTER TABLE `tb_g7service`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g7simplicity`
--
ALTER TABLE `tb_g7simplicity`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g8humility`
--
ALTER TABLE `tb_g8humility`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g8justice`
--
ALTER TABLE `tb_g8justice`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g8mercy`
--
ALTER TABLE `tb_g8mercy`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g8produce`
--
ALTER TABLE `tb_g8produce`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g8wisdom`
--
ALTER TABLE `tb_g8wisdom`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g9compassion`
--
ALTER TABLE `tb_g9compassion`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g9courage`
--
ALTER TABLE `tb_g9courage`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g9fortitude`
--
ALTER TABLE `tb_g9fortitude`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g9modesty`
--
ALTER TABLE `tb_g9modesty`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g9perseverance`
--
ALTER TABLE `tb_g9perseverance`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g10charity`
--
ALTER TABLE `tb_g10charity`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g10faith`
--
ALTER TABLE `tb_g10faith`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g10hope`
--
ALTER TABLE `tb_g10hope`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_g10loyalty`
--
ALTER TABLE `tb_g10loyalty`
  MODIFY `sched_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `tb_reqday`
--
ALTER TABLE `tb_reqday`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_reqsubject`
--
ALTER TABLE `tb_reqsubject`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tb_reqtime`
--
ALTER TABLE `tb_reqtime`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tb_sched_request`
--
ALTER TABLE `tb_sched_request`
  MODIFY `req_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `userdata`
--
ALTER TABLE `userdata`
  MODIFY `user_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
