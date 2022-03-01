package Repositorio_POO.CursoPOOUber.Java;


class Tarjeta extends Payment{
    String numbers;
    String date;
    Integer cvv;
    
    public Tarjeta(int id, String numbers, String date, Integer cvv){
        super(id);
        this.numbers = numbers;
        this.date = date;
        this.cvv = cvv;
    }
    
}
