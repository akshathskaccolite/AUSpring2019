-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: localhost    Database: cab_management
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cabserver`
--

DROP TABLE IF EXISTS `cabserver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `cabserver` (
  `server_id` varchar(225) NOT NULL,
  `cust_id` varchar(225) DEFAULT NULL,
  `loc_id` varchar(20) DEFAULT NULL,
  `cab_id` varchar(225) DEFAULT NULL,
  `admin_id` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`server_id`),
  KEY `cust_id` (`cust_id`),
  KEY `loc_id` (`loc_id`),
  KEY `cab_id` (`cab_id`),
  KEY `admin_id` (`admin_id`),
  CONSTRAINT `cabserver_ibfk_1` FOREIGN KEY (`cust_id`) REFERENCES `customer` (`cust_id`),
  CONSTRAINT `cabserver_ibfk_2` FOREIGN KEY (`loc_id`) REFERENCES `location` (`loc_id`),
  CONSTRAINT `cabserver_ibfk_3` FOREIGN KEY (`cab_id`) REFERENCES `cabs` (`cab_id`),
  CONSTRAINT `cabserver_ibfk_4` FOREIGN KEY (`admin_id`) REFERENCES `administrator` (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cabserver`
--

LOCK TABLES `cabserver` WRITE;
/*!40000 ALTER TABLE `cabserver` DISABLE KEYS */;
INSERT INTO `cabserver` VALUES ('Serv101','Cust103','Loc105','Cab105','Admin104'),('Serv102','Cust102','Loc101','Cab101','Admin105'),('Serv103','Cust105','Loc104','Cab104','Admin103'),('Serv104','Cust104','Loc102','Cab103','Admin102'),('Serv105','Cust101','Loc101','Cab102','Admin101');
/*!40000 ALTER TABLE `cabserver` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-12 23:59:52
