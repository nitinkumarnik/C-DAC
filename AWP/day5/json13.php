<?php

	// json string
	$json_cars = '{"BMW":"M3","lambo":"glardo","rolls":"ghost"}';
	$json = '{"a":1,"b":2,"c":3,"d":4,"e":5}';
	// echo $json_cars;
	
	// converting json string to php object
	$cars = json_decode($json_cars);
	echo var_dump($cars);
	
	echo nl2br("\n");
	
	// converting json string to associative array
	$aphpar = json_decode($json, true);
	echo var_dump($aphpar);
	
	
	// $marvel['ironman'] = 'tony stark';
	// echo $marvel->ironman; // trying to getproperty 'ironman' of non-object

?>