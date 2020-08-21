<?php 
	
	$rcvdjson = $_POST['thekey'];
	
	$pobj = json_decode($rcvdjson);
	
	// $result['res'] = "Something...";
	
	$result = 0;
	
	if($pobj->location == "blr")
		$result = 1;
	else if($pobj->location == "dli")
		$result = 2;
	
	echo $result;

?>