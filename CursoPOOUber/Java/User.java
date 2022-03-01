package Repositorio_POO.CursoPOOUber.Java;

class User extends Account{

    public User(String name, String document){
        super(name, document);
    }
    
    void printDataUser(){
        System.out.println("Nombre de usuario: "+ name+
        "Documento: "+document);
    }
}
