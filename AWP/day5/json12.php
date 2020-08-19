<?php
	
	// associative array
	$cars = array("BMW"=>"M3", "lambo"=>"glardo", "rolls"=>"ghost");
	
	// converting associative array to json string
	$json_cars = json_encode($cars);
	
	echo $json_cars;


?>