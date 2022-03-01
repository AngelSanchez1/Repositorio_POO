package Repositorio_POO.CursoPOOUber.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Sonic");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan van = new UberVan("JDHSA3", new Account("Roger Zalazar", "Shek22222"));
        van.setPassenger(6);
        van.printDataCar();

        /*Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.printDataCar();*/
    }
}