<?php
    $string = $_GET["str"];

    //change case to lower
    $string = strtolower($string);

    //reverse the string
    $reverse = strrev($string);

    if ($string == $reverse) {
        echo "YES";
    } 
    else {
        echo "NO";
    }
?>