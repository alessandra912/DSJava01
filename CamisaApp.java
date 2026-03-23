public class CamisaApp {
    public static void main(String[] args) {
        Camisa c = new Camisa("Azul",  "G", "Algodão");

        System.out.println("\nCor da camisa: "+c.getCor());
        System.out.println("Tamaho da camisa: "+c.getTamanho());
        System.out.println("Tipo da camisa: "+c.getTipo());
    }
}
