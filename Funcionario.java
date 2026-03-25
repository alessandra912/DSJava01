public class Funcionario {
    String nome;
    private float salarioBase;

    public Funcionario(String nome, double salario1){
        this.nome=nome;
        this.salarioBase=(float) salario1;
    }

    public String getNome(){
        return nome;
    }

    public float getSalarioBase(){
        return salarioBase;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setSalarioBase(float salarioBase){
        this.salarioBase=salarioBase;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public void exibirInfo(){
        System.out.println("Informe seu nome: "+getNome());
        System.out.println("Informe seu Salário base: "+getSalarioBase());
    }
}