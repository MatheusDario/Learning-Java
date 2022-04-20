package about_arrays.exercicios;

import java.util.Scanner;

public class Persionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentedRoom[] rentedRoom = new about_arrays.exercicios.RentedRoom[10];
        String name, email;
        int roomQuantity, roomId;
        boolean flag;

        System.out.println("How many rooms will be rented? ");

        do{
            roomQuantity = sc.nextInt();
            if(roomQuantity >= 1 && roomQuantity <= 10) {
                flag = true;
            }else {
                System.out.println("\nOnly allowed range 1-10  to set quantity of rooms");
                System.out.print("Please, pay attention! Enter valid value");
                flag = true;
            }
        }while (flag == false);

        for(int i = 1; i <= roomQuantity; i++){
            System.out.printf("%nRent #%d:%n", i);
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            roomId = sc.nextInt();

            rentedRoom[roomId] = new about_arrays.exercicios.RentedRoom(name, email, roomId);
        }

        System.out.println("\nBusy rooms: ");
        for(about_arrays.exercicios.RentedRoom room : rentedRoom) {
            if(room != null) {
                System.out.println(room);
            }
        }
        System.out.println();
        sc.close();
    }
}
