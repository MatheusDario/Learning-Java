package about_abstrac_class_methods.application;

import about_abstrac_class_methods.entities.Account;
import about_abstrac_class_methods.entities.BusinessAccount;
import about_abstrac_class_methods.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account>  accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
        accounts.add(new SavingsAccount(1003, "Pedro", 800.0, 0.02));
        accounts.add(new BusinessAccount(1004, "Tatiana", 600.0, 200.0));
        accounts.add(new BusinessAccount(1005, "Jose", 400.0, 900.0));

        double sum = 0.0;
        for (Account acc : accounts) {
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", sum);

        for(Account acc : accounts) {
            acc.deposit(20);
        }
        for (Account acc : accounts) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
        double sum2 = 0.0;
        for (Account acc : accounts) {
            sum2 += acc.getBalance();
        }
        System.out.printf("Total Balance Updated: %.2f%n", sum2);

        //Account acc1 = new Account(1001, "Alex", 1000.0);



    }
}
