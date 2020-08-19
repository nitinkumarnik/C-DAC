<?php

$x = 5;


scopeTest();

function scopeTest() {
	global $x;
	echo $x;
}





echo $x;


?>