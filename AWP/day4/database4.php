<?php
// update in the db;


	$server = "localhost";
	$user = "root";
	$pass = "";
	$db = "test";
	
	$conn = new mysqli($server, $user, $pass, $db);
	
	if ($conn->connect_error) {
		die ("Failed to connect.");
	}
	
	echo nl2br("Kismat Konnection\n");

	$sql = "update products set name='vivobook' where id=7";
	
	if($conn->query($sql)) {
		echo "Updated";
	} else {
		echo "Something happend :'(";
	}



?>