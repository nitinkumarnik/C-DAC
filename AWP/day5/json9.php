<?php
// object in php


class Car {
	// properties
	public $name;
	public $model;
	
	// Methods
	function set_name($name) {
		$this->name = $name;
	}
	
	function get_name() {
		return $this->name;
	}
}

$racing = new Car();
$sedan = new Car();

$racing->set_name('BMW');

echo $racing->get_name();


?>