<?php
//$dts = '{"deptid":3 }';
$dts =$_POST["xyz"];// 
$po =  json_decode($dts);

if($po->deptid == "4")
{
    $data = array(
        array(
            "empno" => "21",
            "empname" => "A"
        ),
        array(
            "empno" => "22",
            "empname" => "B"
        ),
    );
}
if($po->deptid != "4")
 {

    $data = array(
        array(
            "empno" => "41",
            "empname" => "X"
        ),
        array(
            "empno" => "42",
            "empname" => "Y"
        ),
    
    );
}

$dtoclient["result"]= $data;
$abc = json_encode($dtoclient);
echo $abc;
?>