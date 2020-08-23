<?php
$a=$_POST["xyz"];
// $c='{"num":3}';
$b=json_decode($a);
$toclient["status"]=0;
$arr= array("1","2","3","4");
$arrlength = count($arr);

for($i=0;$i<$arrlength;$i++){
	// echo $arr[$i];
	if($arr[$i]==$b->num){
		//echo $arr[$i];
		$toclient["status"]=1;
		break;
	}
	else
		$toclient["status"]=0;
}
$abc=json_encode($toclient);
echo $abc;
?>