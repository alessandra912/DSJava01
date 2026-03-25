public class Gerente extends Funcionario{
    private double bonus = 2000;

    public Gerente(String nome, double salario1){
        super(nome, salario1);
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + bonus;
    }
    
}
