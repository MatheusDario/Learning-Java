package about_matrizes.exercicios;

import java.util.Scanner;

public class Ex_Proposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de linhas da matriz:");
        int n = sc.nextInt();
        System.out.println("Digite a quantidade de colunas da matriz:");
        int m = sc.nextInt();
        int [][] matriz = new int [n][m];

        System.out.println("Digite os valores de dentro da matriz:");
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++){
               matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um valor para X: ");
        int x = sc .nextInt();

        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[i].length; j++) {
                if(matriz[i][j] == x) {
                    System.out.println("Position de x: " + i + "," + j);
                    if(j > 0){
                        System.out.println("Left: " + matriz[i][j-1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matriz[i-1][j]);
                    }
                    if(j < m-1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i < n-1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
