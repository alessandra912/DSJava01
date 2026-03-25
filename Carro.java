public class Carro extends Veiculo{
    private String qtdPortas;

    public Carro(String marca, int ano, String qtdPortas){
        super(marca, ano);
        this.qtdPortas=qtdPortas;
    }

    public String getqtdPortas(){
        return qtdPortas;
    }

    public void setqtdPortas(String qtdPortas){
        this.qtdPortas=qtdPortas;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Quantidade de portas: "+getqtdPortas());
    }
}
