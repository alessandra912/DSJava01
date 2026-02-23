public class diversao04 {
    public static void main(String[] args) {
        // ESCREVA UM CÓDIGO QUE IMPRIMA NA TELA A TABUADA DE TODOS OS NÚEMROS DE 1 A 10
        for(int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }
    }
}