import java.util.Arrays;
import java.util.Scanner;

public class Diversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomeProduto = new String[5];
        int[] qtdProduto = new int[5];

        int qtd = 0;
        int opcao;

        while (true) {
            System.out.println("\n=== Cadastro de Produtos ===");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- Pequisar");
            System.out.println("4- Alterar");
            System.out.println("5- Remover");
            System.out.println("6- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 6){
                System.out.println("\nEncerrando...");
                break;
            }

            switch (opcao) {
                case 1:
                    if (qtd == nomeProduto.length){
                    System.out.println("\nNão é possível cadastrar mais nenhum produto. A lista está cheia!");   
                    break;
                    }

                    System.out.println("\nDigite o nome do produto: ");
                    nomeProduto[qtd] = sc.nextLine();
                    
                    System.out.println("\nDigite a quantidade do produto: ");
                    qtdProduto[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("\nProduto cadastrado com sucesso!");
                    break;

                case 2:
                    if (qtd == 0){
                        System.out.println("\nNenhum produto cadastrado.");
                        break;
                    }

                    System.out.println("\nDados cadastrados:");
                    for (int i = 0; i < qtd; i++){
                        System.out.println(i + " - " + nomeProduto[i] + ", " + qtdProduto[i] + " unidades");
                    }
                    break;

                case 3:
                    if (qtd == 0){
                        System.out.println("\nNenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("\nDigite o nome do produto: ");
                    String buscando = sc.nextLine();

                    int Busca = -1;
                    for (int i = 0; i < qtd; i++){
                        if (nomeProduto[i].equalsIgnoreCase(buscando)) {
                            Busca = i;
                            break;
                        }
                    }

                    if (Busca == -1){
                        System.out.println("\nProduto não encontrado.");
                    } else {
                        System.out.println("Encontrado: " + nomeProduto[Busca] + ", " + qtdProduto[Busca] + " unidades");
                    }
                    break;

                case 4:
                    if (qtd == 0){
                        System.out.println("\nNenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("\nDigite o nome do produto para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i < qtd; i++){
                        if (nomeProduto[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    }

                    if (posAlt == -1){
                        System.out.println("\nProduto não encontrado.");
                    } else {
                        System.out.print("\nNovo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova quantidade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        nomeProduto[posAlt] = novoNome;
                        qtdProduto[posAlt] = novaIdade;

                        System.out.println("\nAlterado com sucesso!");
                    }
                    break;

                case 5:
                    if (qtd == 0){
                        System.out.println("\nNenhum produto cadastrado.");
                        break;
                    }

                    System.out.print("\nDigite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRem = -1;
                    for (int i = 0; i < qtd; i++){
                        if (nomeProduto[i].equalsIgnoreCase(nomeRemover)) {
                            posRem = i;
                            break;
                        }
                    }

                    if (posRem == -1){
                        System.out.println("\nProduto não encontrado.");
                    } else {
                        for (int i = posRem; i < qtd - 1; i++) {
                            nomeProduto[i] = nomeProduto[i + 1];
                            qtdProduto[i] = qtdProduto[i + 1];
                        }
                        nomeProduto[qtd - 1] = null;
                        qtdProduto[qtd - 1] = 0;

                        qtd--;
                        System.out.println("\nRemovido com sucesso!");
                    }
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        sc.close();

    }
}