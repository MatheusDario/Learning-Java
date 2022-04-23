package about_interfaces.exercicios.application;

import about_interfaces.exercicios.model.entities.Contract;
import about_interfaces.exercicios.model.entities.Installment;
import about_interfaces.exercicios.model.service.ContractService;
import about_interfaces.exercicios.model.service.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contract data ");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        sc.nextLine();
        System.out.print("Contract value: ");
        Double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue );

        System.out.print("Enter number of installmens: ");
        Integer qntMonths = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, qntMonths);

        System.out.println("Installments:");
        for(Installment in : contract.getInstallments()) {
            System.out.println(in);
        }




        sc.close();
    }
}
