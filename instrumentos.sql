/*
SQLyog Ultimate v9.63 
MySQL - 5.5.5-10.3.16-MariaDB : Database - instrumentosdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`instrumentosdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `instrumentosdb`;

/*Table structure for table `api_instrumento` */

DROP TABLE IF EXISTS `api_instrumento`;

CREATE TABLE `api_instrumento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `instrumento` varchar(255) DEFAULT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `modelo` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  `costo_envio` varchar(255) DEFAULT NULL,
  `cantidad_vendida` int(11) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8;

/*Data for the table `api_instrumento` */

insert  into `api_instrumento`(`id`,`instrumento`,`marca`,`modelo`,`imagen`,`precio`,`costo_envio`,`cantidad_vendida`,`descripcion`) values (1,'Mandolina Instrumento Musical Stagg Sunburst','Stagg','M20','nro10.jpg',2450,'G',30,'Estas viendo una excelente mandolina de la marca Stagg, con un sonido muy dulce, tapa aros y fondo de tilo, y diapasÃ³n de palisandro. Es un instrumento acÃºstico (no se enchufa) de cuerdas dobles (4 pares) con la caja ovalada y cÃ³ncava, y el mÃ¡stil corto. Su utilizaciÃ³n abarca variados Ã¡mbitos, desde rock, folk, country y ensambles experimentales.'),(2,'Pandereta Pandero Instrumento Musical','DyM ventas','32 sonajas','nro9.jpg',325,'150',10,'1 Pandereta - 32 sonajas metÃ¡licas. MÃ¡s de 8 aÃ±os vendiendo con 100 % de calificaciones POSITIVAS y clientes satisfechos !!'),(3,'Triangulo Musical 24 Cm Percusion','LBP','24','nro8.jpg',260,'250',3,'Triangulo Musical de 24 CentÃ­metros De Acero. ENVIOS POR CORREO O ENCOMIENDA: Se le deberÃ¡n adicionar $40 en concepto de Despacho y el Costo del envÃ­o se abonarÃ¡ al recibir el producto en Terminal, Sucursal OCA o Domicilio'),(4,'Bar Chimes Lp Cortina Musical 72 Barras','FM','LATIN','nro7.jpg',2250,'G',2,'BARCHIME CORTINA MUSICAL DE 25 BARRAS LATIN CUSTOM. Emitimos factura A y B'),(5,'Shekeres. Instrumento. MÃºsica. ArtesanÃ­a.','Azalea ArtesanÃ­as','Cuentas de madera','nro6.jpg',850,'300',5,'Las calabazas utilizadas para nuestras artesanÃ­as son sembradas y cosechadas por nosotros, quienes seleccionamos el mejor fruto para garantizar la calidad del producto y ofrecerle algo creativo y original.'),(6,'Antiguo Piano Aleman Con Candelabros.','Neumeyer','Stratus','nro3.jpg',17000,'2000',0,'Buen dia! Sale a la venta este Piano AlemÃ¡n Neumeyer con candelabros incluidos. Tiene una talla muy bonita en la madera. Una pieza de calidad.');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
