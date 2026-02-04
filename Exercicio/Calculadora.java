//ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO DOIS NÚMEROS E EXIBA A SOMA, SUBTRAÇÃO, DIVISÃO E MULTIPLICAÇÃO.
//ESCREVA UM PROGRAMA QUE CALCULE O IMC DE UM INDIVÍDUO, UTILIZANDO A FÓRMULA IMC =PESO / ALTURA2.

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe N1 ");
        double n1 = sc.nextDouble();

        System.out.println("Informe N2 ");
        double n2 = sc.nextDouble();

        double soma = n1+n2;

        double subtrair = n1-n2;

        double divisao = n1/n2;

        double multiplicar = n1*n2;

       
        System.out.println("Resultado ="+ soma);
        System.out.println("Resultado ="+ subtrair);
        System.out.println("Resultado ="+ divisao);
        System.out.println("Resultado ="+ multiplicar);

        sc.close();
    }
}