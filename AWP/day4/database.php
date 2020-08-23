<?php
	
	$servername = "localhost";
	$username = "root";
	$password = "";
	$database = "test";
	
	$conn = new mysqli($servername, $username, $password, $database);
	
	if ($conn->connect_error) {
		echo "Failed...";
	}
	else {
		echo nl2br("Success\n");
		
		// here we can write mysql statements.
		$sql = "insert into products values (5, 'zyphrus g90', 75000, 'asus')";
		
		if ($conn->query($sql) === TRUE) {
			echo "table created";
		} else {
			echo "Error ". $conn->error;
		}
		
		
	}

	$conn->close();

?>