import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Animal sc = new Animal(); // Não é possível criar um objeto de uma classe abstrata
        System.out.println("Escolha o animal: 1 - Cachorro || 2 - Gato");
        int escolha = sc.nextInt();

        Animal animalSelecionado;
        if (escolha == 1) {
            animalSelecionado = new Cachorro();
        } else if (escolha == 2) {
            animalSelecionado = new Gato();
        } else {
            System.out.println("Opção inválida!");
            sc.close();
            return;
        }

        animalSelecionado.fazerSom();

        sc.close();
    }
}