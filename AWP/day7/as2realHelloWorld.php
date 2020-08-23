<?php

	$rcvd = $_POST['key'];
	// $rcvd = '{"empid":"2","mob":"7894561237","loc":"blr","fn":"add"}';
	$pobj = json_decode($rcvd);
	
	$empid = $pobj->empid;
	$mob = $pobj->mob;
	$loc = $pobj->loc;
	$fn = $pobj->fn;
	
	//echo $empid.$mob.$loc.$fn;
	
	$server = "localhost";
	$user = "root";
	$password = "";
	$db = "test";
	
	$result['status'] = 0;
	
	$conn = mysqli_connect($server, $user, $password, $db);
	
	if ($conn->connect_error) {
		$result['status'] = "Error 808: Error Not Found.";
	} else {
	
	
	// enable/disable
	if ($fn == "edlogic") {
		$stmt = $conn->prepare("select empid from emp where empid = ? ");
		$stmt->bind_param("i", $empid);
		// execute query
		$stmt->execute();
		// store result
		$stmt->store_result();
		// no of rows affected
		$conn->affected_rows;
		// rows count
		if($stmt->num_rows > 0) {
			$result['status'] = 1;
		}
	} // edlogic
	
	
	
	// add
	if ($fn == "add"){
		
		$stmt = $conn->prepare('insert into emp values (?, ?, ?)');
		$stmt->bind_param("iss", $empid, $mob, $loc);
		$stmt->execute();
		if ($conn->affected_rows > 0) {
			$result['status'] = 1;
		}
		
	}// add end
	
	
	// remove
	if ($fn == "remove"){
		$stmt = $conn->prepare('delete from emp where empid = ?');
		$stmt->bind_param("i", $empid);
		$stmt->execute();
		if ($conn->affected_rows > 0) {
			$result['status'] = 1;
		}
		
	}
	
	// modify
	if ($fn == "modify"){
		$stmt = $conn->prepare('update emp set mobileno = ?, location=? where empid = ?');
		$stmt->bind_param("ssi", $mob, $loc, $empid);
		$stmt->execute();
		if ($conn->affected_rows > 0) {
			$result['status'] = 1;
		}
	} // ends
	
	
	// all rows select *
	$stmtsel = $conn->prepare("select * from emp");
	if ($stmtsel->execute() === TRUE) {
		$r = $stmtsel->get_result();
		$z = $r->fetch_all(MYSQLI_ASSOC); // the associative array
		$result['arr'] = $z;
	}
	
	} // conn else.
	
	$res = json_encode($result);
	
	echo $res;

?>