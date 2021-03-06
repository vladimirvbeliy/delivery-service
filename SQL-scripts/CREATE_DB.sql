-- create user rest pass rest
CREATE USER 'rest'@'localhost' IDENTIFIED BY 'rest';
GRANT ALL PRIVILEGES ON * . * TO 'rest'@'localhost';

-- create db
DROP SCHEMA IF EXISTS `rest_task`;

CREATE SCHEMA `rest_task`;

USE `rest_task`;

SET FOREIGN_KEY_CHECKS = 0;

-- task
DROP TABLE IF EXISTS `TASK`;

CREATE TABLE `TASK`
(
  `ID` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `TITLE`  VARCHAR(10) NOT NULL,
  `FIRST_NAME`  VARCHAR(50) NOT NULL,
  `LAST_NAME`  VARCHAR(50) NOT NULL,
  `SCHEDULED_DATE`  DATE NOT NULL,
  `NOTES`  VARCHAR(120),
  `ADDRESS_ID`  INT,
  CONSTRAINT `FK_ADDRESS` FOREIGN KEY (`ADDRESS_ID`)
  REFERENCES `ADDRESS` (`ID`)

) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

-- address
DROP TABLE IF EXISTS `ADDRESS`;

CREATE TABLE `ADDRESS`
(
  `ID` INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `ADDRESS_LINE_1`  VARCHAR(50) NOT NULL,
  `ADDRESS_LINE_2`  VARCHAR(50),
  `TOWN`  VARCHAR(50) NOT NULL,
  `COUNTRY`  VARCHAR(50) NOT NULL,
  `POSTCODE`  VARCHAR(10) NOT NULL

)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
