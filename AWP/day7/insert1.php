<?php
	
	$rcvd = $_POST['nkey'];
	// $rcvd = '{"id":"100","name":"4k monitor","price":"28000","brand":"aorus"}';
	
	$pobj = json_decode($rcvd);
	
	$result['status'] = "Looking...";
	
	$id = $pobj->id;
	$name = $pobj->name;
	$price = $pobj->price;
	$brand = $pobj->brand;
	
	$server = "localhost";
	$user = "root";
	$password = "";
	$db = "test";
	
	$conn = mysqli_connect($server, $user, $password, $db);
	
	if ($conn->connect_error) {
		$result['status'] = "Error 808: Error Not Found.";
	} else {
		
		$stmt = $conn->prepare("INSERT INTO products (id, name, price, brand) VALUES (?, ?, ?, ?)");
		$stmt->bind_param("isis", $id, $name, $price, $brand);
		
		if ($stmt->execute()  === TRUE) {
			$result['status'] = "One Row created. Successfully.";
		} else {
			$result['status'] = "Huh.! Nothing happens.";
		}
		
		// echo $id.$name.$price.$brand;
		
		$res = json_encode($result);
		
		echo $res;
	}

	

?>