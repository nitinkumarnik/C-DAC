<?php

	$cars = array("BMW"=>"M3", "lambo"=>"glardo", "rolls"=>"ghost");
	
	//echo $cars["BMW"];
	
	foreach ($cars as $x => $value) {
		echo nl2br($x . " " . $value. "\n");
	}


?>