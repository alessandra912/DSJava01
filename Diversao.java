import java.util.Scanner;

public class Diversao {
// Construir um programa em Java, no console, que permita Cadastrar, Listar, Alterar e Remover nomes usando um array e um menu repetitivo.
// O sistema deve usar um array de String com capacidade fixa (ex.: 10).
// O array deve se  chamar carros
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] carros = new String[3];
        int opcoes;
        
        System.out.println("=== CADASTRO DE NOMES ===");
        for (int i = 0; i < carros.length; i++) {
            System.out.print("Digite um nome: ");
            carros[i] = sc.nextLine();
        }

        System.out.println("\nLista atual:");
        listar(carros);

        do {
            System.out.println("\n=== Escolha uma das opções a seguir ===");
            System.out.println("1 - Listar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Remover");
            System.out.println("0- Sair");
            System.out.print("Escolha uma opção: ");

            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) {
                case 1:
                    listar(carros);
                    break;

                case 2:
                    System.out.print("\nDigite a posição para alterar: ");
                    int posAlterar = sc.nextInt();
                    sc.nextLine();

                    if (posAlterar >= 0 && posAlterar < carros.length) {
                        System.out.print("Digite o novo nome: ");
                        carros[posAlterar] = sc.nextLine();
                    } else {
                        System.out.println("Posição inválida!");
                    }

                    System.out.println("\nLista após alteração:");
                    listar(carros);
                    break;

                case 3:
                    System.out.print("\nDigite a posição para remover: ");
                    int posRemover = sc.nextInt();

                    if (posRemover >= 0 && posRemover < carros.length) {
                        for (int i = posRemover; i < carros.length - 1; i++) {
                            carros[i] = carros[i + 1];
                        }

                        carros[carros.length - 1] = null;
                    } else {
                        System.out.println("Posição inválida!");
                    }

                    System.out.println("\nLista após remoção:");
                    listar(carros);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
                }
                
        } while (opcoes != 0); 

        sc.close();
    }    

    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);

        }
    }
}