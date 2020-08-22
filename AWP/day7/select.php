<?php


	$rcvd =$_POST['key']; 
	// $rcvd = '"1"';
	$pobj = json_decode($rcvd);

	$test="";

	$result['status'] = "Cool";

	$servername = "localhost";
	$username = "root";
	$password = "";
	$dbname = "test";

	$conn = new mysqli($servername, $username, $password, $dbname);

	$result['status'] = "dragon queen.";
	if ($conn->connect_error) {
		$result['status'] = "failed";
	} 
	else
	{
	
	$stmt = $conn->prepare("select id, name,price, brand  from products where id > ? ");

	$stmt->bind_param("i", $pobj);	




	if ($stmt->execute() === TRUE) {
		$result['status'] = "Sounds Good";
		$r = $stmt->get_result();
		$z = $r->fetch_all(MYSQLI_ASSOC); // the associative array
		$result['arr'] = $z;
	} else {
		$result['status'] = "Whaat!";
	}
	
	$conn->close();
	
	$res = json_encode($result);
	
	echo $res;
	
}

	
	
?>

