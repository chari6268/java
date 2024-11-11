import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(initialBalance);
        System.out.println("Initial balance: " + account.getBalance());
        
        double depositAmount, withdrawAmount;
        System.out.print("Enter deposit amount: ");
        depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: " + account.getBalance());

        System.out.print("Enter withdraw amount: ");
        withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        sc.close();
    }
}
