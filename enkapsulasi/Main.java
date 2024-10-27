package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount arthurErickson = new BankAccount(180);
        arthurErickson.deposit(10);
        System.out.println(arthurErickson.getSaldo());
    }
}
