import java.util.Scanner;

public class Cond01{

    public static void main(String[] args) {

        // String nome = "Alessandra";
        // int idade = 22;
        // System.out.println("Olá "+nome+ "sua idade é" +idade);
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome: ");
        String nome = sc.next();

        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        // Condicional simples
        if (idade>=18) {
            System.out.println(nome+"sua idade é "+idade+"você tem maior idade");
        }

        System.out.println("Olá "+nome+ "sua idade é" +idade);

        sc.close();
    }
}