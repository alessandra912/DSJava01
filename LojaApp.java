import java.util.Scanner;

public class LojaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja lj = new Loja(null, 0, 0);


        System.out.println("\n== Sistema de Loja ===");
        System.out.println("\nInforme o nome do produto: ");
        lj.setNome(sc.nextLine());

        System.out.println("Digite o preço: ");
        lj.setPreco(sc.nextFloat());

        System.out.println("Digite a quantidade que deseja: ");
        lj.setQuantidade(sc.nextInt());
        
        System.out.println("Informações da Compra: "+lj.getNome()+ ", preço: "+lj.getPreco()+ ", quantidade: "+lj.getQuantidade());

        sc.close();
    }
}