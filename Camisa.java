public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;

    public Camisa(String cor, String tamanho, String tipo){
        this.cor=cor;
        this.tamanho=tamanho;
        this.tipo=tipo;
    }
        public String getCor(){
            return this.cor;
    }
        public String getTamanho(){
            return this.tamanho;
    }
        public String getTipo(){
            return this.tipo;
    }
        public void setCor(String cor){
            this.cor=cor;
    }
        public void setTamanho(String tamanho){
            this.tamanho=tamanho;
    }
        public void setTipo(String tipo){
            this.tipo=tipo;
    }
}