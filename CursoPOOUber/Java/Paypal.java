package Repositorio_POO.CursoPOOUber.Java;
class Paypal extends Payment{
    String email;
    
    public Paypal(Integer id, String email){
        super(id);
        this.email = email;
    }
    
}
