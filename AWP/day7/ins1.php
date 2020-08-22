<?php

// ensure all your
//parameters are there in the variables.
//ensure you are clear about json format
//you plan to send.
/*
	$x=$_POST['k1'];
	$y=$_POST['k2'];
	$z =$_POST['k3'];
	$a=$_POST['k4'];
*/
//reading 4 posts is pathetic
// read all the 4 parameters as a json string
// convert this into php object and then read empno, empname
// by using   --> from the php object.
	
	$rcvd = $_POST['mekey'];
	$pobj = json_decode($rcvd);


/*
	$x =46;
	$y ='apsara pencil';
	$z = 3;
	$a='exec hpl';
*/



	$servername = "localhost";
	$username = "root";
	$password = "";
	$dbname = "test";




	$conn = new mysqli($servername, $username, $password, $dbname);

	$result = "";
	if ($conn->connect_error) {
		$result = "0";
	} 
	else
	{
		$stmt = $conn->prepare("INSERT INTO products (id, name, price,brand) VALUES (?,?,?,?)");

		$stmt->bind_param("isis", $id, $name,$price,$a);

		$id=$pobj->id;
		$name=$pobj->name;
		$price =$pobj->price;
		$a = $pobj->brand;

//dont return hard coded plain text return a json
//object 
		if ($stmt->execute() === TRUE) {
			$result = "1"; //assume it is success
		} else {
			$result = "-1";// assume it is failure
		}
	
	$conn->close();

	// echo "server ki jai ho.";
	
	}
	echo $result;
	
?>

