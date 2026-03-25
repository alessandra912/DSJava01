import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja lj = new Loja(null, 0, 0);

        System.out.println("\n=== SISTEMA DE LOJA ===");
        System.out.println("\nInforme o nome do produto: ");
        lj.setNome(sc.nextLine());

        System.out.println("Digite o preço do produto: ");
        lj.setPreco(sc.nextFloat());

        System.out.println("Informe a quantidade que foi comprada: ");
        lj.setQuantidade(sc.nextInt());

        System.out.println("Informações da compra: Produto: "+lj.getNome()+ ", Preço: "+lj.getPreco()+ ", Quantidade: "+lj.getQuantidade());
        System.out.println("\nTotal a pagar: "+lj.calcularTotal());

        sc.close();
    }
}