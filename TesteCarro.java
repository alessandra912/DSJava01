public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro(null, null, 2010, 120500.00);
        Carro c2 = new Carro(null, null, 2020, 250000.00);
        
        c1.exibirDetalhes();
        System.out.println("");

        c2.exibirDetalhes();
    }
}