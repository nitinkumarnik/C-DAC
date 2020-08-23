<?php

  $jsonrect = $_GET['jsonstr'];
  
  $rect = json_decode($jsonrect);
  
  $area = $rect->len * $rect->bre;
  $peri = 2 * ($rect->len + $rect->bre);
  
  $crect['area'] = $area;
  $crect['peri'] = $peri;
  
  $rectjson = json_encode($crect);
  
  echo $rectjson;



?>