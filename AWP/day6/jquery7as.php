<?php

	// 6. recieve json str on php
	// $rcvd = '{"length":"4","breadth":"5"}';
	$rcvd = $_POST['measures'];
	
	// 7. decode json str to php object
	$rcvdobj = json_decode($rcvd);
	
	// 8. do the business logic
	$area = $rcvdobj->length * $rcvdobj->breadth;
	
	// 9. make assoc array
	$result['area'] = $area;
	
	// 10. encode to json str
	$toclient = json_encode($result);
	
	// 10a. send to the client
	echo $toclient;

?>