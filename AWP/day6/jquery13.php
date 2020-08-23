<?php

	$rcvd = $_POST['itskey'];
	// $rcvd = '{ "deptid":4}';
	$poj = json_decode($rcvd);
	
	if ($poj->deptid == 4)
		$cjson = '{"result" : [{"empno":21, "empname":"A"}, {"empno":22, "empname":"B"} ]}';
	else
		$cjson = '{"result" : [{"empno":41, "empname":"X"}, {"empno":42, "empname":"Y"} ]}';
	
	// $dtc = json_encode($cjson);

	echo $cjson;

?>