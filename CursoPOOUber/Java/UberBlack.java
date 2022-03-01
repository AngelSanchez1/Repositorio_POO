package Repositorio_POO.CursoPOOUber.Java;

import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{

    Map<String, Map<String, Integer>> typeCarAceppted;
    ArrayList<String> seatsMaterial;


    public UberBlack( String license, Account driver, 
     Map<String, Map<String, Integer>> typeCarAceppted, ArrayList<String> seatsMaterial){
        super(license, driver);
        this.typeCarAceppted = typeCarAceppted;
        this.seatsMaterial = seatsMaterial;
    }
    
}
