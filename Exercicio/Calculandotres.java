//ESCREVA UM PROGRAMA QUE CALCULE A MÉDIA ARITMÉTICA DE TRÊS NÚMEROS.

import java.util.Scanner;

public class Calculandotres {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe N1 ");
        double n1 = sc.nextDouble();

        System.out.println("Informe N2 ");
        double n2 = sc.nextDouble();

        System.out.println("Informe N3 ");
        double n3 = sc.nextDouble();
        

        double media = (n1+n2+n3) / 2;

        System.out.println("Média ="+ media);

        sc.close();
    }
    
}
