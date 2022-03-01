index.php

COLAPSAR<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
require_once("Payment.php");
require_once("Efectivo.php");
require_once("User.php");
require_once("Driver.php");
require_once("uberVan.php");

echo "\nDatos de uberX\n";
$uberX = new UberX("CVB123", new Account("Andres Herrera \n", "AND456\n"), "Chevrolet", "Spark");
$uberX->printDataCar();

echo "\nDatos de uberPool\n";
$uberPool = new UberPool("TYU567", new Account("Andrea Ferran\n", "ANDA765\n"), "Dodge", "Attitude");
$uberPool->printDataCar();

echo "\nDatos de uberX\n";
$uberX1 = new UberX("ASCAS2", new Account("Carlos Daniel\n","CDani12\n"),"Chevrolet","2543213");
$uberX1->setPassenger(4);
$uberX1->printDataCar();

echo "\n\nDatos de pago en efectivo\n";
$efectivo = new Efectivo(1);
$efectivo->printDataPayment();

echo "\nDatos de user\n";
$us = new User("OEdio","\nINE\n");
$us->printDataUser();

echo "\nDatos de uberVan\n";
$uberVan = new UberVan("OJL395\n", new Account("Raúl Ramírez\n", "AND456\n"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();
 
?>