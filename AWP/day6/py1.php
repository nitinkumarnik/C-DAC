<?php
$dts=$_POST["xyz"];
$abc=json_decode($dts);
$toclient["result"]=0;
if($abc->oper=="+")
{
	$toclient["result"]=$abc->n1+$abc->n2;
}
else if($abc->oper=="*")
{
	$toclient["result"]=($abc->n1)*($abc->n2);
}
else if($abc->oper=="-")
{
	$toclient["result"]=$abc->n1-$abc->n2;
}

$return=json_encode($toclient);

echo $return;
?>