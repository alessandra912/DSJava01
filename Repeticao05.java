import java.util.Scanner;

public class Repeticao05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op=0;

        while (op!=4) {
            System.out.println("===== Menu Interativo =====");
            System.out.println("1-Cadastrar");
            System.out.println("2-Listar");
            System.out.println("3-Remover");
            System.out.println("4-Sair");
            System.out.println("Informe a opção: ");

        op=sc.nextInt();

        switch (op) {
            
            case 1:
                System.out.println("1-Cadastrar");
                break;               
            case 2:
                System.out.println("2-Listar");                
                break;
            case 3:
                System.out.println("3-Remover");
                break;
            case 4:
                System.out.println("4-Sair");
                break;
        
            default:
                System.out.println("Opção inválida!");
                break;
        }            
    }

    sc.close();
    }
}