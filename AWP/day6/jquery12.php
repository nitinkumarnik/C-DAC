<?php

	$rcvd = $_POST['itskey'];
	// $rcvd = '{ "n1": 1, "n2":3,"oper":"+"}';
	
	$pobj = json_decode($rcvd);
	
	$op = $pobj->oper;
	$num1 = $pobj->n1;
	$num2 = $pobj->n2;
	
	if ($op == "+")
		$result['res'] = $num1 + $num2;
	else if($op == "-")
		$result['res'] = $num1 - $num2;
	else if($op == "*")
		$result['res'] = $num1 * $num2;
	else if($op == "/")
		$result['res'] = $num1 / $num2;
	
	$dtc = json_encode($result);
	
	echo $dtc;

?>