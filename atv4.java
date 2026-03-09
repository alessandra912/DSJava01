// 4-ESCREVA UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É MAIOR DE IDADE OU NÃO.

import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        double idade = sc.nextDouble();

        if (idade < 18 ) {
        System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade!");
        }

     
    sc.close();

    }
    
}
