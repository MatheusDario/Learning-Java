package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Bob", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Anna", 1000.0, 100.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());

        BusinessAccount acc4 = new BusinessAccount(1004, "Pedro", 1000.0, 100.0);
        acc4.loan(90);
        System.out.println(acc4.getBalance());
    }
}
