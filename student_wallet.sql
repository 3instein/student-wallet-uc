-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 17, 2021 at 03:18 PM
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
(13, 1, 'Deposit', 20000, 'Mon Nov 23 14:47:05 WIB 2020'),
(14, 1, 'Deposit', 10000, 'Sun Nov 29 15:01:17 WIB 2020'),
(15, 1, 'Deposit', 70000, 'Sun Nov 29 15:01:22 WIB 2020'),
(16, 1, 'Deposit', 10000, 'Sun Nov 29 15:02:33 WIB 2020'),
(17, 1, 'Deposit', 10000, 'Sun Nov 29 15:02:37 WIB 2020'),
(18, 1, 'Withdraw', 120000, 'Sun Nov 29 15:02:47 WIB 2020'),
(19, 1, 'Withdraw', 1000000, 'Sun Nov 29 15:02:53 WIB 2020'),
(20, 1, 'Outgoing Transfer', 1000000, 'Sun Nov 29 15:04:57 WIB 2020'),
(21, 2, 'Incoming Transfer', 1000000, 'Sun Nov 29 15:04:57 WIB 2020'),
(22, 1, 'Withdraw', 2000000, 'Sun Nov 29 15:41:30 WIB 2020'),
(23, 1, 'Deposit', 2000000, 'Sun Nov 29 15:42:14 WIB 2020'),
(25, 1, 'Deposit', 1700000, 'Sun Nov 29 15:53:53 WIB 2020'),
(27, 1, 'Deposit', 1700000, 'Sun Nov 29 15:54:26 WIB 2020'),
(28, 1, 'Payment', 1700000, 'Sun Nov 29 15:58:18 WIB 2020'),
(29, 1, 'Deposit', 1700000, 'Sun Nov 29 16:03:44 WIB 2020'),
(30, 1, 'Payment', 1700000, 'Sun Nov 29 16:03:47 WIB 2020'),
(31, 1, 'Deposit', 10000000, 'Thu Dec 03 09:36:49 WIB 2020'),
(32, 1, 'Payment', 1700000, 'Thu Dec 03 09:39:08 WIB 2020'),
(33, 1, 'Deposit', 400000, 'Mon Jan 11 09:09:21 WIB 2021'),
(34, 1, 'Withdraw', 1000000, 'Mon Jan 11 09:09:32 WIB 2021'),
(35, 1, 'Outgoing Transfer', 1000000, 'Mon Jan 11 09:09:50 WIB 2021'),
(36, 2, 'Incoming Transfer', 1000000, 'Mon Jan 11 09:09:50 WIB 2021'),
(37, 1, 'Payment', 1700000, 'Mon Jan 11 09:11:02 WIB 2021'),
(38, 1, 'Deposit', 100000000, 'Fri Jan 15 16:20:00 WIB 2021'),
(39, 1, 'Withdraw', 50000000, 'Fri Jan 15 16:20:21 WIB 2021'),
(40, 1, 'Payment', 1700000, 'Fri Jan 15 16:21:27 WIB 2021');

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
(1, 1, 1700000, '24-11-2020', 'Paid'),
(2, 1, 4000000, '24-11-2020', 'Unpaid'),
(3, 1, 1000000, '24-03-2021', 'Unpaid');

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
(0, '', 'admin', 'root', 1, '', 1),
(1, '0706012010011', 'rkindarto', 'root', 5000000, 'Reynaldi Kindarto', 1),
(2, '0706012010021', 'eco123', '12345', 12100000, 'Michael Eco', 1);

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
  MODIFY `transaction_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payment_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

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
