// 3-CRIE UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É CRIANÇA (0-12 ANOS), 
// ADOLESCENTE(13-17 ANO), ADULTO (18-59 ANOS) OU IDOSO(60 ANOS OU MAIS)

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        double idade = sc.nextDouble();

     if (idade <= 12) {
            System.out.println("Você é criança! ");
        }else if (idade > 12 && idade < 18) {
            System.out.println("Você é adoleente!");
        } else if (idade > 18 && idade < 60) {
            System.out.println("Você é adulto!");
        } else {
            System.out.println("Você é idoso!");
        }
        
    sc.close();

    }
    
}


