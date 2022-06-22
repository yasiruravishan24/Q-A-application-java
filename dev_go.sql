-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2021 at 08:51 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dev_go`
--

-- --------------------------------------------------------

--
-- Table structure for table `answers`
--

CREATE TABLE `answers` (
  `Answer_Id` int(255) NOT NULL,
  `Questions_Id` varchar(255) NOT NULL,
  `Answer` text NOT NULL,
  `Publish_Date` date NOT NULL,
  `AnswPublisher_ID` int(255) NOT NULL,
  `QuesPublisher` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `answers`
--

INSERT INTO `answers` (`Answer_Id`, `Questions_Id`, `Answer`, `Publish_Date`, `AnswPublisher_ID`, `QuesPublisher`) VALUES
(1, '1', 'printf(\"string\")', '2021-08-23', 3, 1),
(2, '1', 'print(\"name\");', '2021-08-23', 6, 1),
(3, '2', 'Select column_name(s)\r\nfrom table1\r\nINNER JOIN table2\r\nON table1.column_name = table2.column_name;', '2021-08-23', 5, 1),
(4, '2', 'Select Employee.Eno,\nEmployee.Ename, Department.DeptNo,\nDepartment.Dname\nfrom Employee INNER JOIN\nDepartment \nON Employee.Dno=Department.DeptNo;', '2021-08-24', 6, 1);

-- --------------------------------------------------------

--
-- Table structure for table `jobs`
--

CREATE TABLE `jobs` (
  `Job_id` int(255) NOT NULL,
  `Job_title` varchar(255) NOT NULL,
  `Job_type` varchar(255) NOT NULL,
  `Role` varchar(255) NOT NULL,
  `Tech` varchar(255) NOT NULL,
  `TelePhone` int(255) NOT NULL,
  `Publisher_id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jobs`
--

INSERT INTO `jobs` (`Job_id`, `Job_title`, `Job_type`, `Role`, `Tech`, `TelePhone`, `Publisher_id`) VALUES
(1, 'Web Development', 'FullTime', 'Frontend', 'HTML/CSS', 712345678, 1),
(3, 'Game design', 'Part Time', 'Game Developing', 'Unity', 782348762, 3),
(4, 'Data base design Sql Query', 'Full Time', 'DataBase ', 'SQL', 765434563, 5);

-- --------------------------------------------------------

--
-- Table structure for table `progress`
--

CREATE TABLE `progress` (
  `progress_id` int(255) NOT NULL,
  `user_id` varchar(255) NOT NULL,
  `Num_Of_Que` int(255) DEFAULT NULL,
  `Num_Of_Ans` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `progress`
--

INSERT INTO `progress` (`progress_id`, `user_id`, `Num_Of_Que`, `Num_Of_Ans`) VALUES
(1, '1', 4, 0),
(3, '3', 4, 1),
(4, '4', 0, 0),
(5, '5', 1, 1),
(6, '6', 0, 2);

-- --------------------------------------------------------

--
-- Table structure for table `questions`
--

CREATE TABLE `questions` (
  `Que_Id` int(255) NOT NULL,
  `Que_Title` varchar(255) NOT NULL,
  `TechTag` varchar(255) NOT NULL,
  `Questions` text NOT NULL,
  `submit_date` date NOT NULL,
  `publisher_Id` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `questions`
--

INSERT INTO `questions` (`Que_Id`, `Que_Title`, `TechTag`, `Questions`, `submit_date`, `publisher_Id`) VALUES
(1, 'Print String  using Python', 'Python', 'How to print string value in python', '2021-08-23', 1),
(2, 'Inner Join Sql', 'SQL', 'How to use inner join in sql query', '2021-08-23', 1),
(3, 'Get user input c++', 'C++', 'how to get user input in c++', '2021-08-23', 1),
(4, 'JSON mean', 'JSON', 'What is the meanig of JSON?', '2021-08-23', 1),
(5, 'Web site python', 'Python', 'How do I click on a button go the previous website,and repeat it self with next button?', '2021-08-23', 3),
(6, 'Text file C++', 'C++', 'how to read content in a .txt file that is limited by two words in C ++', '2021-08-23', 3),
(7, 'Java Scrip array', 'JavaScript', 'How to transform an array of streaming service prices into an array of objects \ncategorized by the service length?', '2021-08-23', 3),
(8, 'Json add custom drawable image as  ', 'JSON', 'How to add custom drawable image as menu items in navigation drawer , image must be exact colour as in the asset', '2021-08-23', 3),
(9, 'Php metrics', 'Php', 'How does php_fpm_max_children_reached metrics work?', '2021-08-23', 5);

-- --------------------------------------------------------

--
-- Table structure for table `user_acc`
--

CREATE TABLE `user_acc` (
  `User_Id` int(255) NOT NULL,
  `First_Name` varchar(255) NOT NULL,
  `Second_Name` varchar(255) NOT NULL,
  `BOD` date NOT NULL,
  `Email` varchar(255) NOT NULL,
  `User_Name` varchar(255) NOT NULL,
  `Password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_acc`
--

INSERT INTO `user_acc` (`User_Id`, `First_Name`, `Second_Name`, `BOD`, `Email`, `User_Name`, `Password`) VALUES
(1, 'Yasiru', 'Ravishan', '2000-02-02', 'yasiru@gmail.com', 'yas@1234', '1234'),
(3, 'Ravishan', 'Yasiru', '2000-02-01', 'ravishan@gmail.com', 'rav@1234', '1234'),
(4, 'Test', 'Admin', '2021-08-05', 'test@gmail.com', 'test@1234', '1234'),
(5, 'Dewmal', 'Pasan', '1999-08-05', 'dewmal@gmail.com', 'dew@1234', '1234'),
(6, 'Chamith', 'Earanda', '2000-08-18', 'chamith@gmail.com', 'cha@1234', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `answers`
--
ALTER TABLE `answers`
  ADD PRIMARY KEY (`Answer_Id`);

--
-- Indexes for table `jobs`
--
ALTER TABLE `jobs`
  ADD PRIMARY KEY (`Job_id`);

--
-- Indexes for table `progress`
--
ALTER TABLE `progress`
  ADD PRIMARY KEY (`progress_id`);

--
-- Indexes for table `questions`
--
ALTER TABLE `questions`
  ADD PRIMARY KEY (`Que_Id`);

--
-- Indexes for table `user_acc`
--
ALTER TABLE `user_acc`
  ADD PRIMARY KEY (`User_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `answers`
--
ALTER TABLE `answers`
  MODIFY `Answer_Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `jobs`
--
ALTER TABLE `jobs`
  MODIFY `Job_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `progress`
--
ALTER TABLE `progress`
  MODIFY `progress_id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `questions`
--
ALTER TABLE `questions`
  MODIFY `Que_Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `user_acc`
--
ALTER TABLE `user_acc`
  MODIFY `User_Id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
