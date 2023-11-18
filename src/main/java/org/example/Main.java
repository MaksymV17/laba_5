import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        //  Сворення акаунта
        BankAccount account1 = bank.createAccount("John Doe", 1000.0);
        System.out.println("Created account: " + account1.getAccountSummary());

        // Створення ще одного акаунта
        BankAccount account2 = bank.createAccount("Jane Doe", 500.0);
        System.out.println("Created account: " + account2.getAccountSummary());

        // Приклад переводу грошей між акаунтами
        System.out.println("Transfer money from account 1 to account 2:");
        System.out.print("Enter amount: ");
        double transferAmount = scanner.nextDouble();
        bank.transferMoney(account1.getAccountNumber(), account2.getAccountNumber(), transferAmount);

        // Вивід інформації о балансе після перевода
        System.out.println("Account 1: " + account1.getAccountSummary());
        System.out.println("Account 2: " + account2.getAccountSummary());

        scanner.close();
    }
}
