<?php
$cars = array("maruti", "hyundai", "honda");
//echo "w3c schools like " . $cars[0] . ", " . $cars[1] . " and " . $cars[2] . "!";

for($i=0; $i < count($cars); $i++) 
{
	echo "is it in for loop <br>";
	if($cars[$i]=="honda")
		echo "<Br/> $cars[$i]";
}		
	
	



?>
