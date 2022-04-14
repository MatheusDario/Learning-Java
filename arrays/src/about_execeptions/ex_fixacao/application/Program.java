package about_execeptions.ex_fixacao.application;

import about_execeptions.ex_fixacao.model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        sc.nextLine();
        System.out.print("Initial Balance: ");
        Double balance  = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdraw = sc.nextDouble();

        Account acc1 = new Account(number, holder, balance, withdraw);

        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        acc1.withdraw(amount);

        System.out.println("New balance: " + acc1.getBalance());
    }
}
