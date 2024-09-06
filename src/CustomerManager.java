public class CustomerManager {

    private Logger[] loggers;

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Müşteri eklendi " + customer.getFirstName());

        Utils.runLoggers(loggers, customer.getFirstName()); //Utils sınıfında metodumuzu static yazdığımız için Utils utils = new Utils(); yazmamıza gerek kalmadı.
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getLastName());
    }
}
