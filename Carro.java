public class Carro {
    private String marca;
    private String model;
    private int anofabricacao;

    public Carro(String marca, String model, int anofabricacao){
        this.marca=marca;
        this.model=model;
        this.anofabricacao=anofabricacao;
    }
        public String getmarca(){
            return this.marca;
    }   
        public String getmodel(){
            return this.model;
    }
        public int getanofabricacao(){
            return this.anofabricacao;
    }
        public void setmarca(String marca){
            this.marca=marca;
    }
        public void setmodel(String model){
            this.model=model;
    }
        public void setanofabricacao(int anofabricacao){
            this.anofabricacao=anofabricacao;
    }
}