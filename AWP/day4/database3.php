<?php
// select * from table;



	$server = "localhost";
	$username = "root";
	$password = "";
	$database = "test";
	
	$conn = new mysqli($server, $username, $password, $database);

	
	
	if ($conn->connect_error) {
		echo "Oho..! Connection mai hi error ho gya.";
	} else {
		
		$sql = "select * from products";
		
		$x = $conn->query($sql);
		if ($x->num_rows > 0) {
			while($row = $x->fetch_assoc()) {
				echo nl2br($row["id"]. " | ". $row["name"]. " | ". $row["price"]. " | " .$row["brand"]. "\n");
			}
		} else {
			echo "No Data.! 0 Rows)";
		}
		
		
		
		
	}



?>