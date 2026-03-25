import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente(sc.nextInt(), sc.nextLine(), sc.nextLine());

        System.out.println("Digite o seu código: ");
        cliente.setCodigo(sc.nextInt());
        sc.nextLine();

        System.out.println("Informe seu nome: ");
        cliente.setNome(sc.nextLine());

        System.out.println("Informe seu endereço: ");
        cliente.setEndereco(sc.nextLine());

        System.out.println("=== DADOS INFORMADOS ===");
        cliente.exibirInfo();   
    }
}

// === Exibindo as informaçoes na tela ===
// Cliente pf = new ClientePf(1, "Alessandra", "Rua A", "999.999.999-99");

// pf.exibirInfo();


// === Mais uma forma de fazer ===
// Cliente c1 = new ClientPf(0, null, null, null);
// Cliente c2 = new ClientPf(0, null, null, null);

// c1.exibirInfo();
// c2.exibirInfo();