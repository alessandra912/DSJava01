// 1-Elaborar um programa que permita ler um número inteiro a partir do teclado, 
// e apresentar a indicação de que é positivo, negativo ou nulo.

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

    if ( numero > 1) {
            System.out.println("Número positivo! ");
        }else if ( numero < 1 && numero!= 0) {
            System.out.println( " Número negativo! ");
        } else {
            System.out.println("Número nulo!");
        }
    sc.close();    
    }
    
}
