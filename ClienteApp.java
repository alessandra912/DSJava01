public class ClienteApp {
    public static void main(String[] args) {

        ClientePf pf = new ClientePf("Alessandra", "Rua T", "123.456.789-00");

        ClientePj pj = new ClientePj("AAPetiscos", "Rua C", "54565464/446446" );

        System.out.println("Cliente PF: "+pf.getNome());
        System.out.println("Endereço: "+pf.getEndereco());
        
        pf.atualizarDados(null, null);
        pj.atualizarDados(null);

        System.out.println();
    }    
}