<?php
	
	$rcvd = $_POST['key'];
	// $rcvd = '"65"';
	
	$pobj = json_decode($rcvd);
	
	$id = $pobj;
	
	$result['status'] = "Looking...";
	
	$server = "localhost";
	$user = "root";
	$password = "";
	$db = "test";
	
	$conn = mysqli_connect($server, $user, $password, $db);
	
	if ($conn->connect_error) {
		$result['status'] = "Error 808: Error Not Found.";
	} else {
		
		
		
		$stmt = $conn->prepare('DELETE FROM products WHERE id = ?');
		
		$stmt->bind_param('i', $id);
		
		$stmt->execute();
		//echo $conn->affected_rows;
		if($conn->affected_rows > 0) {
			$result['status'] = "Row Deleted.";
		} else {
			$result['status'] = "Nothing happend.";
		}
		
		$res = json_encode($result);
		
		echo $res;
		
		
		
		
	}	
		
		
?>