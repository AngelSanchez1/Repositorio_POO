<?php
require_once('Payment.php');

class Tarjeta extends Payment{
    public $number;
    public $date;
    public $cvv;
    
    public function __construct($id, $number, $date, $cvv)
    {
        parent::__construct($id);
        $this->number= $number;
        $this->date = $date;
        $this->cvv = $cvv;
    }
}

?>