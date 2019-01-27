CREATE DATABASE  IF NOT EXISTS `dbwsvendas` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `dbwsvendas`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dbwsvendas
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.36-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_cliente`
--

DROP TABLE IF EXISTS `tbl_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_cliente` (
  `pk_id_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `cli_nome` varchar(300) NOT NULL,
  `cli_endereco` varchar(350) NOT NULL,
  `cli_bairro` varchar(300) NOT NULL,
  `cli_cidade` varchar(200) NOT NULL,
  `cli_uf` varchar(2) NOT NULL,
  `cli_cep` varchar(9) NOT NULL,
  `cli_telefone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_cliente`
--

LOCK TABLES `tbl_cliente` WRITE;
/*!40000 ALTER TABLE `tbl_cliente` DISABLE KEYS */;
INSERT INTO `tbl_cliente` VALUES (1,'WENDEL SEGADILHA','RUA SÃO JOÃO','VILA ADELAIDE CABRAL','SANTA INES','MA','65300-855','(98)98600-3186');
/*!40000 ALTER TABLE `tbl_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_forma_pagamento`
--

DROP TABLE IF EXISTS `tbl_forma_pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_forma_pagamento` (
  `pk_id_for_pag` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `descricao_for_pag` varchar(255) NOT NULL,
  `desconto_for_pag` float NOT NULL,
  `parcelas_for_pag` int(11) NOT NULL,
  `situacao_for_pag` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_for_pag`),
  UNIQUE KEY `pk_id_for_pag` (`pk_id_for_pag`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_forma_pagamento`
--

LOCK TABLES `tbl_forma_pagamento` WRITE;
/*!40000 ALTER TABLE `tbl_forma_pagamento` DISABLE KEYS */;
INSERT INTO `tbl_forma_pagamento` VALUES (1,'A VISTA',0,1,1);
/*!40000 ALTER TABLE `tbl_forma_pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_produto`
--

DROP TABLE IF EXISTS `tbl_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_produto` (
  `pk_id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `pro_nome` varchar(300) NOT NULL,
  `pro_valor` double NOT NULL,
  `pro_estoque` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
INSERT INTO `tbl_produto` VALUES (1,'CAMISA GOLA POLO',30,77),(2,'BERMUDA JEANS MASCULINA',60,77),(3,'CAMISA GOLA CARECA',25,73);
/*!40000 ALTER TABLE `tbl_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_usuario`
--

DROP TABLE IF EXISTS `tbl_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_usuario` (
  `pk_id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `usu_nome` varchar(150) NOT NULL,
  `usu_login` varchar(100) NOT NULL,
  `usu_senha` varchar(20) NOT NULL,
  PRIMARY KEY (`pk_id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_usuario`
--

LOCK TABLES `tbl_usuario` WRITE;
/*!40000 ALTER TABLE `tbl_usuario` DISABLE KEYS */;
INSERT INTO `tbl_usuario` VALUES (1,'Administrador','admin','admin');
/*!40000 ALTER TABLE `tbl_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_venda`
--

DROP TABLE IF EXISTS `tbl_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_venda` (
  `pk_id_venda` int(11) NOT NULL AUTO_INCREMENT,
  `fk_cliente` int(11) NOT NULL,
  `ven_data` date NOT NULL,
  `ven_valor_liquido` double NOT NULL,
  `ven_valor_bruto` double NOT NULL,
  `ven_desconto` double NOT NULL,
  PRIMARY KEY (`pk_id_venda`),
  KEY `fk_cliente_venda` (`fk_cliente`),
  CONSTRAINT `fk_cliente_venda` FOREIGN KEY (`fk_cliente`) REFERENCES `tbl_cliente` (`pk_id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_venda`
--

LOCK TABLES `tbl_venda` WRITE;
/*!40000 ALTER TABLE `tbl_venda` DISABLE KEYS */;
INSERT INTO `tbl_venda` VALUES (7,1,'2019-01-05',90,90,0),(8,1,'2019-01-05',230,240,10),(9,1,'2019-01-05',300,300,0),(10,1,'2019-01-05',110,120,10),(11,1,'2019-01-05',150,150,0),(12,1,'2019-01-05',88,90,2),(13,1,'2019-01-05',300,300,0),(14,1,'2019-01-05',300,300,0),(15,1,'2019-01-05',90,90,0),(16,1,'2019-01-05',90,90,0),(17,1,'2019-01-08',360,360,0),(20,1,'2019-01-08',450,450,0),(21,1,'2019-01-09',80,80,0),(22,1,'2019-01-10',90,90,0),(23,1,'2019-01-10',270,270,0),(24,1,'2019-01-10',55,55,0),(25,1,'2019-01-10',30,30,0),(26,1,'2019-01-10',25,25,0),(27,1,'2019-01-10',200,200,0),(28,1,'2019-01-11',565,565,0),(29,1,'2019-01-11',100,30,1),(30,1,'2019-01-11',25,25,0),(31,1,'2019-01-11',50,55,5),(32,1,'2019-01-11',25,25,5),(33,1,'2019-01-11',30,30,0),(34,1,'2019-01-11',110,115,5),(35,1,'2019-01-11',25,25,0),(36,1,'2019-01-11',150,155,5),(37,1,'2019-01-11',30,30,0),(38,1,'2019-01-11',80,80,0),(39,1,'2019-01-12',175,175,0),(40,1,'2019-01-12',180,180,0),(41,1,'2019-01-13',60,60,0),(42,1,'2019-01-18',50,55,5),(43,1,'2019-01-18',30,30,0),(44,1,'2019-01-18',60,60,0),(45,1,'2019-01-18',60,60,0),(46,1,'2019-01-18',90,90,0),(47,1,'2019-01-18',110,115,5),(48,1,'2019-01-19',200,210,10),(49,1,'2019-01-19',60,60,0),(50,1,'2019-01-20',85,85,0);
/*!40000 ALTER TABLE `tbl_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_vendas_produtos`
--

DROP TABLE IF EXISTS `tbl_vendas_produtos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbl_vendas_produtos` (
  `pk_id_venda_produto` int(11) NOT NULL AUTO_INCREMENT,
  `fk_produto` int(11) NOT NULL,
  `fk_venda` int(11) NOT NULL,
  `ven_pro_valor` double NOT NULL,
  `ven_pro_quantidade` int(11) NOT NULL,
  PRIMARY KEY (`pk_id_venda_produto`),
  KEY `fk_produtos_venda` (`fk_produto`),
  KEY `fk_venda_prod` (`fk_venda`),
  CONSTRAINT `fk_produtos_venda` FOREIGN KEY (`fk_produto`) REFERENCES `tbl_produto` (`pk_id_produto`),
  CONSTRAINT `fk_venda_prod` FOREIGN KEY (`fk_venda`) REFERENCES `tbl_venda` (`pk_id_venda`)
) ENGINE=InnoDB AUTO_INCREMENT=97 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas_produtos`
--

LOCK TABLES `tbl_vendas_produtos` WRITE;
/*!40000 ALTER TABLE `tbl_vendas_produtos` DISABLE KEYS */;
INSERT INTO `tbl_vendas_produtos` VALUES (10,1,7,30,1),(11,2,7,60,1),(12,1,8,30,2),(13,2,8,60,3),(14,1,9,30,10),(15,1,10,30,2),(16,2,10,60,1),(17,2,11,60,2),(18,1,11,30,1),(19,1,12,30,1),(20,2,12,60,1),(21,1,13,30,10),(22,2,14,60,5),(23,1,15,30,1),(24,2,15,60,1),(25,1,16,30,1),(26,2,16,60,1),(34,2,17,60,1),(35,1,17,30,10),(38,1,20,30,5),(39,2,20,60,5),(41,3,21,25,2),(42,1,21,30,1),(43,1,22,30,1),(44,2,22,60,1),(45,1,23,30,1),(46,2,23,60,4),(47,1,24,30,1),(48,3,24,25,1),(49,1,25,30,1),(50,3,26,25,1),(51,3,27,25,8),(52,3,28,25,1),(53,2,28,60,9),(54,1,29,30,1),(55,3,30,25,1),(56,1,31,30,1),(57,3,31,25,1),(58,1,31,30,1),(59,3,31,25,1),(60,3,32,25,1),(61,1,33,30,1),(62,1,34,30,1),(63,2,34,60,1),(64,3,34,25,1),(65,3,35,25,1),(66,3,36,25,5),(67,1,36,30,1),(68,1,37,30,1),(69,1,38,30,1),(70,3,38,25,2),(71,2,39,60,1),(72,1,39,30,3),(73,3,39,25,1),(76,2,40,60,3),(79,1,41,30,2),(80,1,42,30,1),(81,3,42,25,1),(82,1,43,30,1),(83,2,44,60,1),(84,2,45,60,1),(85,2,46,60,1),(86,1,46,30,1),(87,1,47,30,1),(88,2,47,60,1),(89,3,47,25,1),(90,2,48,60,1),(91,1,48,30,5),(92,2,48,60,1),(93,1,48,30,5),(94,2,49,60,1),(95,2,50,60,1),(96,3,50,25,1);
/*!40000 ALTER TABLE `tbl_vendas_produtos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-01-27  9:53:15
