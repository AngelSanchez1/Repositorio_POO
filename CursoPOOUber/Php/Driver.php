<?php
require_once('Account.php');

class Driver extends Account{
    public function __construct($name, $document, $email, $password)
    {
        parent::__construct($name, $document, $email, $password);
    }

    public function printDataDriver(){
        echo "\nNombre del usuario: ".$this->name." Documento:".$this->document." Email: ".$this->email." password: ".$this->password; 
    }
}

?>