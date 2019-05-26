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
INSERT INTO `tbl_cliente` VALUES (1,'BALCAO','RUA DO COMERCIO','CENTRO','SANTA INES','MA','65300-000','(98)98495-7066');
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_forma_pagamento`
--

LOCK TABLES `tbl_forma_pagamento` WRITE;
/*!40000 ALTER TABLE `tbl_forma_pagamento` DISABLE KEYS */;
INSERT INTO `tbl_forma_pagamento` VALUES (1,'A VISTA',0,1,1),(2,'A PRAZO',0,1,1),(3,'CARTÃO',0,1,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_produto`
--

LOCK TABLES `tbl_produto` WRITE;
/*!40000 ALTER TABLE `tbl_produto` DISABLE KEYS */;
INSERT INTO `tbl_produto` VALUES (7,'CALCA MASCULINA JEANS',48,98),(8,'SHORT  JEANS INF MASCULINO',25,100),(9,'SHORT INF MOLETON',20,100),(10,'SHORT INF TACTEL',13,99),(11,'SHORT INF JEANS FEM',25,96),(12,'SHORT INF BRIM FEM',15,100),(13,'VESTIDO INFANTIL',25,97),(14,'SHORT MOLETON ADULTO',25,98),(15,'SHORT TACTEL ADULTO',15,100),(16,'BERMUDA JEANS MASC',40,100),(17,'BERMUDA JEANS MASC AYO ',38,99),(18,'BERMUDA JEANS ERONJAN',30,100),(19,'SHORT FEM ALICIA',10,97),(20,'VESTIDO SUPLEX',18,99),(21,'VESTIDO LISTRADO',18,99),(22,'BODYS',18,96),(23,'SHORT VISCOSE',18,100),(24,'SHORT SOCIAL CURTO',25,100),(25,'VESTIDO JACA',15,100),(26,'CONJUNTO BENGALINE',38,99),(27,'SHORT SOCIAL C/CINTO',38,97),(28,'SAIA SOCIAL',35,100),(29,'CALCA SOCIAL FEMENINA',35,99),(30,'VESTIDO SENHORA',38,100),(31,'VESTIDO BENGALINE',48,100),(32,'SHORT JEANS LONGO',35,99),(33,'SHORT JEANS MEIA COXA',35,100),(34,'SHORT JEANS PULSIZE',38,100),(35,'SAIA JEANS CURTA',45,100),(36,'SHORT JEANS CURTO',35,100),(37,'SHORT JEANS C/CINTO',40,100),(38,'SHORT CURTO',25,100),(39,'SHORT IMPORTADO',18,100),(40,'CALCA JEANS FEMENINA',48,100),(41,'SAIA FEM LONGA JEANS',48,100),(42,'SAIA LONGA JEANS',38,100),(43,'BERMUDA JEANS TRADICIONAL',18,100),(44,'CALCA MASC TRAD JEANS',35,100),(45,'CALCA FEM TRAD JEANS',35,100),(46,'EDREDOM',20,100),(47,'MANTA INFANTIL',10,100),(48,'TOALHA DE BANHO',15,100),(49,'COLCHA P/ CAMA',20,100),(50,'BLUSA VISCOSE',15,100),(51,'CAMISETA FEMENINA',18,100),(52,'BLUSA IMPORTADA',20,100),(53,'BLUSA CHIFFON',20,100),(54,'BLUSA BABY LOOK',25,100),(55,'CALCA MOLETON',27,100),(56,'CONJ SUTIA TRADICIONAL',10,100),(57,'CONJUNTO LINGERIE',20,100),(58,'SHORT SEGUNDA PELE',10,100),(59,'CAMISETA SUPLEX',10,100),(60,'SHORT CURTO JEANS TRAD',16,100),(61,'CROPPED',20,100),(62,'CONJUNTO ACADEMIA',35,100),(63,'SHORT CURTO ACADEMIA',25,100),(64,'BLUSA ACADEMIA',25,100),(65,'CAMISETA ACADEMIA',20,100),(66,'VESTIDO FESTA',45,100),(67,'CAMISA GOLA REDONDA',30,100),(68,'CAMISA MACHAO',15,99),(69,'CAMISA GOLA RED ALEATORIO',40,100),(70,'CAMISA GOLA POLO',45,100),(71,'CAMISETA BOB MARLEY',20,100),(72,'CAMISA BOB MARLEY',25,100),(73,'CAMISA JOHN CASH',25,100),(74,'TOP FEMENINO',10,100),(75,'SHORT LONGO ACADEMIA',10,100),(76,'teste',15,100);
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
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_venda`
--

LOCK TABLES `tbl_venda` WRITE;
/*!40000 ALTER TABLE `tbl_venda` DISABLE KEYS */;
INSERT INTO `tbl_venda` VALUES (1,1,'2019-04-28',25,25,0),(2,1,'2019-04-28',56,56,0),(3,1,'2019-04-28',35,35,0),(4,1,'2019-04-28',13,13,0),(5,1,'2019-04-28',25,25,0),(6,1,'2019-04-28',38,38,0),(7,1,'2019-04-28',53,53,0),(8,1,'2019-04-28',10,10,0),(9,1,'2019-04-28',38,38,0),(10,1,'2019-04-28',38,38,0),(16,1,'2019-04-28',100,100,0),(17,1,'2019-04-28',135,135,0),(18,1,'2019-04-28',106,111,5),(19,1,'2019-04-28',35,35,0),(20,1,'2019-04-28',35,35,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_vendas_produtos`
--

LOCK TABLES `tbl_vendas_produtos` WRITE;
/*!40000 ALTER TABLE `tbl_vendas_produtos` DISABLE KEYS */;
INSERT INTO `tbl_vendas_produtos` VALUES (1,14,1,25,1),(2,20,2,18,1),(3,27,2,38,1),(4,32,3,35,1),(5,10,4,13,1),(6,11,5,25,1),(7,26,6,38,1),(8,21,7,18,1),(9,29,7,35,1),(10,19,8,10,1),(11,27,9,38,1),(12,27,10,38,1),(22,13,16,25,3),(23,14,16,25,1),(24,11,17,25,1),(25,17,17,38,1),(26,22,17,18,4),(27,68,18,15,1),(28,7,18,48,2),(29,11,19,25,1),(30,19,19,10,1),(31,11,20,25,1),(32,19,20,10,1);
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

-- Dump completed on 2019-05-25 13:55:15
