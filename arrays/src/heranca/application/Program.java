package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bc = new BusinessAccount(1002, "Matheus Dario", 10.0, 500.0);

        //UPCASTING
        Account acc1 = bc;
        Account acc2 = new BusinessAccount(1003, "Bob", 100.0,200.0);
        Account acc3 = new SavingsAccount(1004, "Ana",5.0 ,0.01);

        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        //BusinessAccount acc5 = (BusinessAccount) acc3; error
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }
        System.out.println(((BusinessAccount) acc2).getLoanLimit());
    }
}
