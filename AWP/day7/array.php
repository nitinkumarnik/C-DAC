<?php

	// $rcvd = $_POST['nkey'];
	$rcvd = '{"num": 8, "newnum": 3, "fn": "edlogic"}';
	$pobj = json_decode($rcvd);
	
	
	
	$store = array(1, 2, 3, 4, 5,);
	//for ($i=0; $i<5; $i++) {
	//	echo " ".$store[$i]." ";
	//}
	
	foreach ($store as $element) { 
		echo "$element "; 
	} 
	
	echo "<br>";
	$result['status'] = 0;

	$num = $pobj->num;
	$nnum = $pobj->newnum;
	$fn = $pobj->fn;

	if (!in_array($num, $store)) {
		array_push($store, $num);
	}
	foreach ($store as $element) { 
		echo "$element "; 
	}
	echo "<br>";
	//unset($store[array_search($num ,$store)]);
	$num = 10;
	array_push($store, $num);
	foreach ($store as $element) { 
		echo "$element "; 
	}
		//if (!in_array($nnum, $store)) {
		//	array_push($store, $nnum);
	$result['arr'] = $store;
	
	echo json_encode($result);

?>