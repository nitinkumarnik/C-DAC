<?php
  
    $dts=$_POST["xyz"];
    $d=json_decode($dts);

    if($d->oper=="*"){
        $dtoclient["result"]=$d->n1*$d->n2;
    }else if($d->oper=="-"){
        $dtoclient["result"]=($d->n1-$d->n2);
    }
    $a=json_encode($dtoclient);
    echo $a;
?>