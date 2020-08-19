<?php

$arr = array();

function fill(&$arr) {

for ($i=0; $i<3; $i++) {
	array_push($arr, $i);
}

}

fill($arr);

echo $arr[0];
echo $arr[1];
echo $arr[2];


?>