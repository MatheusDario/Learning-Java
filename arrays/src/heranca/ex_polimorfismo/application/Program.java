package heranca.ex_polimorfismo.application;

import heranca.ex_polimorfismo.entities.Employee;
import heranca.ex_polimorfismo.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listEmployees = new ArrayList<>();

        System.out.println("Enter the number of employees");
        int qntEmplyes = sc.nextInt();

        for(int i = 1; i<=qntEmplyes; i++) {
            System.out.println("Employee #" + i + " data:");
            sc.nextLine();
            System.out.print("Outsourced (Y/N)?");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String nameEmployee = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour :");
            double valuePerHour = sc.nextDouble();
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                listEmployees.add(new OutSourcedEmployee(nameEmployee, hours ,valuePerHour, additionalCharge));
            } else {
                listEmployees.add(new Employee(nameEmployee, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : listEmployees) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.paymant()));
        }

        sc.close();
    }
}
