package about_interfaces.comparable.application;

import about_interfaces.comparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        String path = "/home/matheus/Documents/Files-course-java-udemy/employee.csv";
        List<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String filds[] = employeeCsv.split(",");
                employees.add(new Employee(filds[0], Double.parseDouble(filds[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(employees);
            for (Employee emp : employees) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
