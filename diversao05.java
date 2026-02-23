import java.util.Scanner;

public class diversao05 {
    public static void main(String[] args) {
       // CRIE UM PROGRAMA QUE SOLICITE AO USUÁRIO UM NÚMERO E EXIBA A TABUADA DESSE NÚMERO UTILIZANDO UM LAÇO DE REPETIÇÃO
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número:");
        int numero = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }

        sc.close();
    } 
}

