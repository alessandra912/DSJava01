import java.util.Scanner;

public class Exdo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Informe o número positivo: ");
            numero=sc.nextInt();
        } while(numero<=0);
        System.out.println("OK, número positivo");

        sc.close();
    }  
}