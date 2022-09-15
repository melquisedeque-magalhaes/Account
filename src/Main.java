public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000.0, 2000.0);

        account.deposit(1000.0);

        account.withdrawMoney(200.0);
    }
}