<?php

	$rcvd = $_POST['nkey'];
	// $rcvd = '{"num": 3, "fn": "edlogic"}';
	$pobj = json_decode($rcvd);
	// echo $pobj;
	$store = array(1, 2, 3, 4, 5,);
	
	$result['status'] = 0;
	
	
	$num = $pobj->num;
	$nnum = $pobj->newnum;
	$fn = $pobj->fn;
	
	if ($fn == "edlogic") {
		if (in_array($num, $store)) {
		$result['status'] = 1;
		}
	}
	
	if ($fn == "add") {
		array_push($store, $num);
		$result['status'] = 1;
	}
	
	if ($fn == "remove") {
		unset($store[array_search('strawberry',$store)]);
		$result['status'] = 1;
	}
	
	if ($fn == "modify") {
		if (!in_array($nnum, $store)) {
			array_push($store, $nnum);
			$result['status'] = 1;
		}
	}
	
	
	$result['arr'] = $store;
	
	$res = json_encode($result);
	
	// echo '{"hello"}';
	echo $res;

?>