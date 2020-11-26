-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 26, 2020 at 02:07 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_wallet`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `transaction_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `type` char(20) NOT NULL,
  `amount` int(10) NOT NULL,
  `date` char(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`transaction_id`, `user_id`, `type`, `amount`, `date`) VALUES
(1, 1, 'Deposit', 15000, 'Sun Nov 22 08:30:05 WIB 2020'),
(2, 1, 'Outgoing Transfer', 25000, 'Sun Nov 22 08:31:16 WIB 2020'),
(3, 2, 'Incoming Transfer', 25000, 'Sun Nov 22 08:31:16 WIB 2020'),
(4, 1, 'Outgoing Transfer', 75000, 'Sun Nov 22 08:31:47 WIB 2020'),
(5, 2, 'Incoming Transfer', 75000, 'Sun Nov 22 08:31:47 WIB 2020'),
(6, 1, 'Deposit', 15000, 'Sun Nov 22 10:17:53 WIB 2020'),
(7, 1, 'Deposit', 50000, 'Sun Nov 22 10:17:57 WIB 2020'),
(8, 1, 'Deposit', 35000, 'Sun Nov 22 10:18:00 WIB 2020'),
(9, 1, 'Deposit', 1000000, 'Sun Nov 22 10:18:07 WIB 2020'),
(10, 1, 'Deposit', 3000000, 'Sun Nov 22 10:18:10 WIB 2020'),
(11, 1, 'Deposit', 6000000, 'Sun Nov 22 10:18:14 WIB 2020'),
(12, 1, 'Withdraw', 10000000, 'Sun Nov 22 10:18:25 WIB 2020'),
(13, 1, 'Deposit', 20000, 'Mon Nov 23 14:47:05 WIB 2020');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payment_id` int(10) NOT NULL,
  `user_id` int(10) NOT NULL,
  `amount` int(10) NOT NULL,
  `date` char(10) NOT NULL,
  `status` char(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payment_id`, `user_id`, `amount`, `date`, `status`) VALUES
(1, 1, 1700000, '24-11-2020', 'Unpaid');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `nim` char(13) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  `balance` int(10) NOT NULL,
  `full_name` char(30) NOT NULL,
  `status` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `nim`, `username`, `password`, `balance`, `full_name`, `status`) VALUES
(1, '0706012010011', 'rkindarto', 'root', 5020000, 'Reynaldi Kindarto', 1),
(2, '0706012010021', 'eco123', '12345', 10100000, 'Michael Eco', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `user_id_key` (`user_id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payment_id`),
  ADD KEY `user_id_payment` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `nim` (`nim`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `transaction_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payment_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `history`
--
ALTER TABLE `history`
  ADD CONSTRAINT `user_id_key` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `user_id_payment` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
