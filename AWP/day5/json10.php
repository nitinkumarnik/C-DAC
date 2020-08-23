<?php

// php object to json string

error_reporting(0);

$dc->name = "batman";
$dc->car = "bat mobil";

//echo $dc->name. " ". $dc->car;

$jsonstr = json_encode($dc);

echo $jsonstr;


?>