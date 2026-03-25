public class Moto extends Veiculo {
    private String cilindrada;

    public Moto(String marca, int ano, String cilindrada){
        super(marca, ano);
        this.cilindrada=cilindrada;
    }

    public String getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(String cilindrada){
        super.exibirInfo();
        System.out.println("Cilindrada: "+getCilindrada());
    }
}
