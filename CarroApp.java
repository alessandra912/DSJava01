public class CarroApp {
    public static void main(String[] args) {
        Carro c = new Carro("Fiat", "Argo", 2022);

        System.out.println("\nMarca: "+c.getmarca());
        System.out.println("Modelo: "+c.getmodel());
        System.out.println("Ano fabricado: "+c.getanofabricacao());
    }
}