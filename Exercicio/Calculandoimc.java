import java.util.Scanner;

public class Calculandoimc {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua altura");
        double altura = sc.nextDouble();

        System.out.println("Informe seu peso");
        double peso = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC ="+ imc);

        sc.close();

    }
    
}
