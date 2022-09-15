public class Account {
    private double balance;
    private double limit;

    public Account(double value, double limit) {
        this.limit = limit;
        this.balance = value;
    }

    public void showBalance() {
        System.out.println("Seu saldo atual é " + this.balance);
    }

    private void balanceWithLimit() {
        this.balance += this.limit;

        System.out.println("Saldo com limite: " + this.balance);
    }

    private void balanceWithoutLimit() {
        this.balance -= this.limit;

        System.out.println("Saldo sem limite: " + this.balance);
    }

    public void deposit(double value) {
        this.balance += value;

        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Saldo atual " + this.balance);
    }

    public void withdrawMoney(double value) {
        balanceWithLimit();
        balanceWithoutLimit();

        if(value > (this.balance + this.limit)) {
            System.out.println("Saldo indisponivel!");
            return;
        }

        this.balance -= value;

        balanceWithLimit();
        balanceWithoutLimit();

        showBalance();
    }
}
