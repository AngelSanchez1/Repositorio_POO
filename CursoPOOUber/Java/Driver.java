package Repositorio_POO.CursoPOOUber.Java;
class Driver extends Account{

    public Driver(String name, String document){
        super(name, document);
    }
    
    void printDataDriver(){
        System.out.println("Nombre de usuario: "+ name+
        "Documento: "+document);
    }
}
