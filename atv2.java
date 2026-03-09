// 2-Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        if (numero % 2 == 0 ) {
            System.out.println("Esse número é par! ");
        }else {
            System.out.println("É um número impar!");
        }

    sc.close();
    }
    
}
