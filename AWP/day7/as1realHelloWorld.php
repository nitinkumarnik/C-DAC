<?php

	$rcvd = $_POST['nkey'];
	//$rcvd = '{"num": 3, "newnum": 80, "fn": "modify"}';
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
		$count  = 0;
		foreach ($store as $ele) {	
			if($num == $ele)
				break;
			$count++;
		}
		array_splice($store, $count, 1);
		//unset($store[array_search($num,$store)]);
		$result['status'] = 1;
	}
	
	if ($fn == "modify") {
		if (!in_array($nnum, $store)) {
			
			for($i = 0; $i < count($store);$i++){	
				if($store[$i] == $num) {
					$store[$i] = $nnum;
					break;
				}
		}
		//array_splice($store, $count, 1);
			//array_push($store, $nnum);
			$result['status'] = 1;
		}
	}
	
	
	$result['arr'] = $store;
	
	$res = json_encode($result);
	
	// echo '{"hello"}';
	echo $res;

?>