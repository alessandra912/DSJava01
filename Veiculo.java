public class Veiculo {
    private String marca;
    private int ano;
    
    public Veiculo(String marca, int ano){
        this.marca=marca;
        this.ano=ano;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public void setMarca(int ano){
        this.ano=ano;
    }

    public void exibirInfo(){
        System.out.println("Informe a marca: "+getMarca());
        System.out.println("Informe o ano: "+getAno());
    }
}
