<?php

	// insert into table values();
	
	
	// variable for db details.
	$server = "localhost";
	$username = "root";
	$password = "";
	$database = "test";
	
	// connection created.
	$conn = new mysqli($server, $username, $password, $database);
	
	// if connection fails.
	if ($conn->connect_error) {
		die ("Connection Failed ");
	}
	
	// program after connection succesful.
	echo nl2br("All program after\n");
	
	
	
	
	
	// insert into table.
	$stmt = $conn->prepare("insert into products values (?, ?, ?, ?)");
	
	$stmt->bind_param("isis", $id, $name, $price, $brand);
	
	// making values insertion dynamic via creating variables.
	$id = 8;
	$name = 'predetor';
	$price = 67000;
	$brand = 'acer';
	$stmt->execute();
	
	// making values insertion dynamic via creating variables.
	$id = 10;
	$name = 'mac air';
	$price = 90000;
	$brand = 'apple';
	
	
	
	if ($stmt->execute() === TRUE) {
		echo "Value inserted";
	} else {
		echo "Error: Cool";
	}
	

	$stmt->close();
	$conn->close();

?>