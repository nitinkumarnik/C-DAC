

<?php
//finally a ok decent php... use server side to supply data.

//http://localhost/ajax1.php?tbn=4&btwt=1
$var1 =$_GET["tbn"]; // we will remove 3 and put _GET ....
$wtd =$_GET["btwt"];// we will remove 1 and put _GET...
$result =0;

if($wtd == 1)
	$result = $var1 * 2;
else
	$result = $var1 * 3;

echo $result;

//echo "hi from php";
//http://localhost/ajax1.php
//sign of stupidness.  file:///C:/xampp/htdocs/ajax1.php
?>

