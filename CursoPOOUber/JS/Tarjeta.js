class Tarjeta extends Payment{

    constructor(id, numbers, date, cvv){
        super(id);
        this.numbers = numbers;
        this.date = date;
        this.cvv = cvv;
    }
}