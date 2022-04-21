package about_files.application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("pegar o nome do arquivo: " + path.getName());
        System.out.println("pegar o nome da pasta: " + path.getParent());
        System.out.println("pegar o caminho completo: " + path.getPath());
    }
}
