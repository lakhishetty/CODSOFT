public class bankaccount {
    private double balance;

    public bankaccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("successfully deposited Rs" + amount);
        } else {
            System.out.println("failed deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("successfully withdrew  Rs" + amount);
        } else {
            System.out.println("withdrawal failed");
        }
    }

    public double getbalance() {
        return balance;
    }

}
