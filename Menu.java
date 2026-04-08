public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n1 - Adicionar novo animal");
            System.out.println("2 - Fazer um animal emitir som");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("\nEscolha o tipo:");
                    System.out.println("1 - Cachorro");
                    System.out.println("2 - Gato");
                    System.out.print("Opção: ");

                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome do animal: ");
                    String nome = sc.nextLine();

                    if (tipo == 1) {
                        animais.add(new Cachorro(nome));
                        System.out.println("Cachorro adicionado!");
                    } else if (tipo == 2) {
                        animais.add(new Gato(nome));
                        System.out.println("Gato adicionado!");
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2:
                    if (animais.isEmpty()) {
                        System.out.println("Nenhum animal cadastrado.");
                        break;
                    }

                    System.out.println("\nAnimais cadastrados:");
                    for (int i = 0; i < animais.size(); i++) {
                        System.out.println((i + 1) + " - " + animais.get(i).getNome());
                    }

                    System.out.print("Escolha um animal: ");
                    int escolha = sc.nextInt();

                    if (escolha > 0 && escolha <= animais.size()) {
                        animais.get(escolha - 1).fazerSom();
                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        sc.close();
    }
}