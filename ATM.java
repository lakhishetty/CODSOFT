import java.util.Scanner;

public class ATM {
    private bankaccount account;
    private Scanner scanner;

    public ATM(bankaccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            showmenu();
            int ch = scanner.nextInt();
            if (ch == 4) {
                System.out.println("thankyou for your using the ATM");
                break;
            }
            choicesoption(ch);
        }
    }

    private void showmenu() {
        System.out.println("ATM MENU");
        System.out.println("1.check balance");
        System.out.println("2.deposit");
        System.out.println("3.withdraw");
        System.out.println("4.exit");
        System.out.println("choose an option");
    }

    private void choicesoption(int ch) {
        switch (ch) {
            case 1:
                System.out.println("current balance Rs" + account.getbalance());
                break;

            case 2:
                System.out.println("enter the amount to deposit");
                double depamount = scanner.nextDouble();
                account.deposit(depamount);
                break;

            case 3:
                System.out.println("enter the amount to withdraw");
                double withdrawamount = scanner.nextDouble();
                account.withdraw(withdrawamount);
                break;

            default:
                System.out.println("invalid option");
        }
    }

    public static void main(String[] args) {
        bankaccount account = new bankaccount(100); // Initial balance of $1000
        ATM atm = new ATM(account);
        atm.start();
    }
}