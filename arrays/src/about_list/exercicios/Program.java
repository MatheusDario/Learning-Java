package about_list.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qntEmployees;
        List<Employees> listEmployees = new ArrayList<>();

        System.out.println("How many employees will be register? ");
        qntEmployees = sc.nextInt();

        for (int i=1; i<=qntEmployees; i++) {
            System.out.printf("%nEmployee #%d:%n", i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (hasId(listEmployees, id)) {
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            sc.nextLine();
            Employees emp = new Employees(id, name, salary);
            listEmployees.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Employees emp = listEmployees.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        //Integer pos = position(listEmployees, idSalary);
        if(emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increseSalary(percent);
        }

        System.out.println("List of employees: ");
        for(Employees emps : listEmployees) {
            System.out.println(emps);
        }
        sc.close();
    }
/*
    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i <=list.size(); i++) {
            if(list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
*/

    public static boolean hasId(List<Employees> list, int id) {
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
