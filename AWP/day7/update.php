<?php
	
	$rcvd = $_POST['nkey'];
	// $rcvd = '{"id":"45","name":"Monitor","price":"28000","brand":"aorus"}';
	
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
		
		$stmt = $conn->prepare("UPDATE products SET name = ?, price = ?, brand = ? WHERE id = ?");
		$stmt->bind_param("sisi", $name, $price, $brand, $id);
		$stmt->execute();
		
		
		if ($conn->affected_rows > 0) {
			$result['status'] = "One Row Updated. Successfully.";
		} else {
			$result['status'] = "Huh.! Nothing happens.";
		}
		
		// echo $id.$name.$price.$brand;
		
		$res = json_encode($result);
		
		echo $res;
	}

	

?>