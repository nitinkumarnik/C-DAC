<?php

	// echo "chla gya.";
	
	$numjson = $_POST['number'];
	
	// $numjson = '{"num":"8"}';
	
	// converting json string as php object
	$num = json_decode($numjson);
	
	// The GREAT logic of 10 multiple
	$tenthMultiple = $num->num * 10;
	
	// Making an associative array.
	$ten['tenth'] = $tenthMultiple;
	
	// converting assoc array to json str
	$tenth = json_encode($ten);
	
	// to client
	echo $tenth;

?>