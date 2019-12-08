-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 16, 2018 at 12:37 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school`
--

-- --------------------------------------------------------

--
-- Table structure for table `academicsession`
--

CREATE TABLE `academicsession` (
  `id` int(11) NOT NULL,
  `start` varchar(50) DEFAULT NULL,
  `end` varchar(50) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `academicsession`
--

INSERT INTO `academicsession` (`id`, `start`, `end`, `status`) VALUES
(1, '2017', '2018', 'enabled'),
(2, '2016', '2017', 'enabled'),
(3, '2013', '2016', 'enabled');

-- --------------------------------------------------------

--
-- Table structure for table `alloted_vechiles`
--

CREATE TABLE `alloted_vechiles` (
  `id` int(11) NOT NULL,
  `enrollment_no` varchar(200) NOT NULL,
  `route_name` varchar(200) NOT NULL,
  `vechile_no` varchar(200) NOT NULL,
  `starting_point` varchar(200) NOT NULL,
  `from_month` varchar(200) NOT NULL,
  `to_month` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alloted_vechiles`
--

INSERT INTO `alloted_vechiles` (`id`, `enrollment_no`, `route_name`, `vechile_no`, `starting_point`, `from_month`, `to_month`) VALUES
(1, '1', 'Outer Ring Road', 'DL-456', 'Pitampura', 'January', 'February');

-- --------------------------------------------------------

--
-- Table structure for table `discount`
--

CREATE TABLE `discount` (
  `id` int(11) NOT NULL,
  `enrollment_no` varchar(10) DEFAULT NULL,
  `standard` varchar(10) DEFAULT '10',
  `Section` varchar(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `fee_occurance` varchar(20) DEFAULT NULL,
  `fee_cateogry` varchar(20) DEFAULT NULL,
  `applicable_from` varchar(20) DEFAULT NULL,
  `amount` varchar(20) DEFAULT NULL,
  `discount` varchar(20) DEFAULT NULL,
  `final_amount` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `discount`
--

INSERT INTO `discount` (`id`, `enrollment_no`, `standard`, `Section`, `name`, `fee_occurance`, `fee_cateogry`, `applicable_from`, `amount`, `discount`, `final_amount`) VALUES
(1, '1', '1st', 'A', 'Ashish Kumar', 'Only Once', 'Building Fees', 'Only Once', '5000', '200', '4800'),
(2, '1', '1st', 'A', 'Ashish Kumar', 'Only Once', 'Building Fees', 'Only Once', '5000', '500', '4500');

-- --------------------------------------------------------

--
-- Table structure for table `driverrecord`
--

CREATE TABLE `driverrecord` (
  `id` int(11) NOT NULL,
  `driver_name` varchar(50) DEFAULT NULL,
  `license_no` varchar(25) DEFAULT NULL,
  `date_of_birth` varchar(50) DEFAULT NULL,
  `license_expiry_date` varchar(50) DEFAULT NULL,
  `contact_no` varchar(20) DEFAULT NULL,
  `experince` varchar(20) DEFAULT NULL,
  `refrence_name` varchar(100) DEFAULT NULL,
  `refrence_contact` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driverrecord`
--

INSERT INTO `driverrecord` (`id`, `driver_name`, `license_no`, `date_of_birth`, `license_expiry_date`, `contact_no`, `experince`, `refrence_name`, `refrence_contact`, `address`) VALUES
(1, 'Neeraj Sharma', '123456', '1984-05-08', '2030-08-31', '9812352478', '4', 'Jagdeep Bhagat', '9982546789', 'sd block market shop no 27 pitampura new Delhi	pin - 110034	.');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `id` int(11) NOT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `dob` varchar(250) DEFAULT NULL,
  `emp_photo` varchar(255) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL,
  `landline` varchar(250) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `email` varchar(250) DEFAULT NULL,
  `h_qualification` varchar(500) DEFAULT NULL,
  `p_marks` varchar(20) DEFAULT NULL,
  `university` varchar(250) DEFAULT NULL,
  `experince` varchar(50) DEFAULT NULL,
  `prev_orgnisation` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`id`, `first_name`, `last_name`, `gender`, `dob`, `emp_photo`, `mobile`, `landline`, `address`, `email`, `h_qualification`, `p_marks`, `university`, `experince`, `prev_orgnisation`) VALUES
(1, 'Ashish', 'Kumar', 'MALE', '1995-05-08', '', '9507169295', '1231545665', 'SubashNagar Bhagwanpur,New Delhi', 'shahi2ashish@gmail.com', 'BCA', '73%', 'L.N.Mishra college Of Business Management Muzffarpur,Bihar', '10', 'Synergywebdesigners.com'),
(2, 'Ashish', 'Kumar', 'MALE', '1995-05-08', '', '9507169295', '0621225645', 'subashnagar,Bhagwanpur,Muzaffarpur', 'shahi2ashish@gmail.com', 'BCA', '73', 'L N Mishra', '3', 'synergywebdesignes.com'),
(3, 'Neeraj ', 'Sharma', 'MALE', '2017-08-08', '', '95123456', '546465465', 'pitampura', 'neeraj@synergywebdesingners.com', 'BCA', '7 3', 'SMU', '5', 'synerrgy');

-- --------------------------------------------------------

--
-- Table structure for table `expenselist`
--

CREATE TABLE `expenselist` (
  `id` int(11) NOT NULL,
  `expense_type` varchar(200) NOT NULL,
  `expense_date` varchar(200) NOT NULL,
  `expense_amount` varchar(200) NOT NULL,
  `note` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenselist`
--

INSERT INTO `expenselist` (`id`, `expense_type`, `expense_date`, `expense_amount`, `note`) VALUES
(1, 'Electricity', '2017-08-12', '5000', 'This Bill Is Paid Against July Month');

-- --------------------------------------------------------

--
-- Table structure for table `expensetype`
--

CREATE TABLE `expensetype` (
  `id` int(11) NOT NULL,
  `expense_type` varchar(200) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expensetype`
--

INSERT INTO `expensetype` (`id`, `expense_type`, `description`) VALUES
(1, 'Electricity', 'Monthaly Electricity Bill Pay on Each Month First Week');

-- --------------------------------------------------------

--
-- Table structure for table `feeoccurance`
--

CREATE TABLE `feeoccurance` (
  `id` int(11) NOT NULL,
  `fee_occurance` varchar(250) NOT NULL,
  `fee_cateogry_name` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feeoccurance`
--

INSERT INTO `feeoccurance` (`id`, `fee_occurance`, `fee_cateogry_name`) VALUES
(1, 'Only Once', 'Building Fees'),
(2, 'Monthly', 'Tuation Fee');

-- --------------------------------------------------------

--
-- Table structure for table `fees`
--

CREATE TABLE `fees` (
  `id` bigint(20) NOT NULL,
  `enrollment_no` varchar(20) NOT NULL,
  `name` varchar(200) NOT NULL,
  `class` varchar(200) NOT NULL,
  `section` varchar(200) NOT NULL,
  `fee_occurance` varchar(200) NOT NULL,
  `fee_cateogry` varchar(200) NOT NULL,
  `amount` varchar(20) NOT NULL,
  `discount` varchar(20) NOT NULL,
  `final_amount` varchar(20) NOT NULL,
  `paid_amount` varchar(20) NOT NULL,
  `paid_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `feesetup`
--

CREATE TABLE `feesetup` (
  `id` int(11) NOT NULL,
  `fee_occurance` varchar(255) NOT NULL,
  `fee_cateogry` varchar(255) NOT NULL,
  `fee_amount` varchar(255) NOT NULL,
  `applicable_for` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `feesetup`
--

INSERT INTO `feesetup` (`id`, `fee_occurance`, `fee_cateogry`, `fee_amount`, `applicable_for`) VALUES
(1, 'Only Once', 'Building Fees', '5000', 'Only One TIme Payable Another Time Not Required'),
(2, 'Monthly', 'Tuation Fee', '1000', 'For All class One Students'),
(3, 'Monthly', 'Tuation Fee', '500', 'All Of Students');

-- --------------------------------------------------------

--
-- Table structure for table `parent_commitments`
--

CREATE TABLE `parent_commitments` (
  `id` int(11) NOT NULL,
  `enrollment_name` varchar(20) DEFAULT NULL,
  `commitment` varchar(10000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parent_commitments`
--

INSERT INTO `parent_commitments` (`id`, `enrollment_name`, `commitment`) VALUES
(1, '1', 'Hey sir ,\r\n\r\n\r\nMy Brother is Sick for few days . Kindaly can you give some day live for school so .\r\nI am very Ungrateful For all live so kindaly Give live for some days my brother .\r\n\r\n				Thank You');

-- --------------------------------------------------------

--
-- Table structure for table `routes`
--

CREATE TABLE `routes` (
  `id` int(11) NOT NULL,
  `route_name` varchar(200) NOT NULL,
  `route_points` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `routes`
--

INSERT INTO `routes` (`id`, `route_name`, `route_points`) VALUES
(1, 'Outer Ring Road', 'Pitampura');

-- --------------------------------------------------------

--
-- Table structure for table `section`
--

CREATE TABLE `section` (
  `id` int(11) NOT NULL,
  `standard` varchar(50) NOT NULL,
  `section` varchar(50) NOT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `section`
--

INSERT INTO `section` (`id`, `standard`, `section`, `status`) VALUES
(1, '1st', 'A', 'enabled'),
(2, '1st', 'B', 'enabled'),
(3, '7th', 'A', 'enabled'),
(4, '2nd', 'A', 'enabled'),
(5, '2nd', 'C', 'enabled'),
(6, '2nd', 'D', 'enabled'),
(7, '8th', 'A', 'enabled');

-- --------------------------------------------------------

--
-- Table structure for table `standard`
--

CREATE TABLE `standard` (
  `id` smallint(6) NOT NULL,
  `standard` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `standard`
--

INSERT INTO `standard` (`id`, `standard`, `status`) VALUES
(1, '1st', 'enabled'),
(2, '2nd', 'enabled'),
(3, '3rd', 'enabled'),
(4, '4th', 'enabled'),
(5, '5th', 'enabled'),
(6, '6th', 'enabled'),
(7, '7th', 'enabled'),
(8, '8th', 'enabled');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL,
  `enrollment_no` varchar(20) DEFAULT NULL,
  `admisson_no` varchar(20) DEFAULT NULL,
  `admisson_date` varchar(200) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `gender` varchar(20) DEFAULT NULL,
  `dob` varchar(200) DEFAULT NULL,
  `standard` varchar(20) DEFAULT NULL,
  `section` varchar(20) DEFAULT NULL,
  `religion` varchar(200) DEFAULT NULL,
  `identity_mark` varchar(250) DEFAULT NULL,
  `student_photo` varchar(250) DEFAULT NULL,
  `father_name` varchar(250) DEFAULT NULL,
  `mother_name` varchar(250) DEFAULT NULL,
  `father_occupation` varchar(250) DEFAULT NULL,
  `mother_occupation` varchar(250) DEFAULT NULL,
  `father_qualification` varchar(250) DEFAULT NULL,
  `mother_qualification` varchar(250) DEFAULT NULL,
  `mob_no` varchar(20) DEFAULT NULL,
  `land_no` varchar(20) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL,
  `email_id` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `enrollment_no`, `admisson_no`, `admisson_date`, `name`, `gender`, `dob`, `standard`, `section`, `religion`, `identity_mark`, `student_photo`, `father_name`, `mother_name`, `father_occupation`, `mother_occupation`, `father_qualification`, `mother_qualification`, `mob_no`, `land_no`, `address`, `email_id`) VALUES
(2, '1', '1', '2017-07-31', 'Ashish Kumar', 'MALE', '1995-05-08', '1st', 'A', 'Hindusm', 'A Mole Mark On The Neck', '', 'Karunesh shahi', 'Kanti shahi', 'Advocate', 'Home Maker', 'Bachelors', 'Bachelors', '9507169295', '0112004123', 'New Delhi', 'shahi2ashish@gmail.com'),
(3, '2', '2', '2017-08-17', 'Kumar Ashish', 'MALE', '1995-05-08', '1st', 'A', 'HIndism', 'A Mole Mark On the right cheek', '', 'Karunesh Shahi', 'Kanti shahi', 'Advocate', 'House Maker', 'Graduation', 'Graduation', '9507169295', '', 'subashnagar, Bhagwanpur , Muzaffarpur , Bihar', 'shahi2ashish@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `emailid` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `address` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `emailid`, `password`, `mobile`, `role`, `department`, `address`) VALUES
(1, 'Ashish', 'shahi2ashish@gmail.com', 'ashish', '9507169295', 'Admin', 'Hindi', 'subashnagar, Bhagwanpur , Muzaffarpur , Bihar'),
(2, 'Neeraj sharma', 'info@synergywebdesigners.com', 'abcdefg@123', '9868330332', 'Staff', 'English', NULL),
(3, 'Ashish Kumar', 'ashish@synergywebdesignes.com', 'abcdefg@123', '9507169295', 'Admin', 'Computers', NULL),
(4, 'Admin', 'admin@123.com', 'admin', '1234567890', 'Admin', 'Mathematics', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `vechiles`
--

CREATE TABLE `vechiles` (
  `id` int(11) NOT NULL,
  `route_name` varchar(200) NOT NULL,
  `vechile_no` varchar(200) NOT NULL,
  `license_no` varchar(200) NOT NULL,
  `capacity` varchar(200) NOT NULL,
  `driver` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vechiles`
--

INSERT INTO `vechiles` (`id`, `route_name`, `vechile_no`, `license_no`, `capacity`, `driver`) VALUES
(1, 'Outer Ring Road', '123', '456', '40', 'Neeraj Sharma'),
(2, 'Outer Ring Road', 'DL-456', '#123', '90', 'Neeraj Sharma'),
(3, 'Outer Ring Road', 'DL-654', '#999123', '120', 'Neeraj Sharma'),
(4, 'Outer Ring Road', 'DL-987', '#456789', '45', 'Neeraj Sharma');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `academicsession`
--
ALTER TABLE `academicsession`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `alloted_vechiles`
--
ALTER TABLE `alloted_vechiles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `discount`
--
ALTER TABLE `discount`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `driverrecord`
--
ALTER TABLE `driverrecord`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expenselist`
--
ALTER TABLE `expenselist`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `expensetype`
--
ALTER TABLE `expensetype`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feeoccurance`
--
ALTER TABLE `feeoccurance`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `fees`
--
ALTER TABLE `fees`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feesetup`
--
ALTER TABLE `feesetup`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `parent_commitments`
--
ALTER TABLE `parent_commitments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `routes`
--
ALTER TABLE `routes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `section`
--
ALTER TABLE `section`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `standard`
--
ALTER TABLE `standard`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `enrollment_no` (`enrollment_no`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `emailid` (`emailid`);

--
-- Indexes for table `vechiles`
--
ALTER TABLE `vechiles`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `academicsession`
--
ALTER TABLE `academicsession`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `alloted_vechiles`
--
ALTER TABLE `alloted_vechiles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `discount`
--
ALTER TABLE `discount`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `driverrecord`
--
ALTER TABLE `driverrecord`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `expenselist`
--
ALTER TABLE `expenselist`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `expensetype`
--
ALTER TABLE `expensetype`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `feeoccurance`
--
ALTER TABLE `feeoccurance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `fees`
--
ALTER TABLE `fees`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `feesetup`
--
ALTER TABLE `feesetup`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `parent_commitments`
--
ALTER TABLE `parent_commitments`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `routes`
--
ALTER TABLE `routes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `section`
--
ALTER TABLE `section`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `standard`
--
ALTER TABLE `standard`
  MODIFY `id` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `vechiles`
--
ALTER TABLE `vechiles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
