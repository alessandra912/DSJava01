public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alessandra", 22);
        Pessoa p2 = new Pessoa("Lucas", 57);

        System.out.println("\nNome da pessoa: "+p1.getNome());
        System.out.println("Idade da pessoa: "+p1.getIdade());

        p1.setNome("Silva");
        p1.setIdade(47);
        
        System.out.println("\nNome da pessoa: "+p2.getNome());
        System.out.println("Idade da pessoa: "+p2.getIdade());

        p2.setNome("Luan");
        p2.setIdade(13);

        System.out.println("\nNome da pessoa: "+p1.getNome());
        System.out.println("Idade da pessoa: "+p1.getIdade());

        System.out.println("\nNome da pessoa: "+p2.getNome());
        System.out.println("Idade da pessoa: "+p2.getIdade());
    }
}
