import java.util.ArrayList;
import java.util.Scanner;

public class SistemaNomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n ==== MENU ====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Pesquisar nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome cadastrado com sucesso!");
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        System.out.println("Lista de nomes:");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 1) + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice do nome a alterar: ");
                    int indiceAlterar = scanner.nextInt();
                    scanner.nextLine();

                    indiceAlterar--;

                    if (indiceAlterar >= 0 && indiceAlterar < nomes.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = scanner.nextLine();
                        nomes.set(indiceAlterar, novoNome);
                        System.out.println("Nome alterado com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o índice do nome a remover: ");
                    int indiceRemover = scanner.nextInt();
                    scanner.nextLine();

                    indiceRemover--;

                    if (indiceRemover >= 0 && indiceRemover < nomes.size()) {
                        nomes.remove(indiceRemover);
                        System.out.println("Nome removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).equalsIgnoreCase(busca)) {
                            System.out.println("Nome encontrado no índice: "+ (i + 1));
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}