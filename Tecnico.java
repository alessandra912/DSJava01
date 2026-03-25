public class Tecnico extends Funcionario{
    private double adicional = 1000;

    public Tecnico(String nome, double salario1){
        super(nome, salario1);

    }
    
    @Override
    public double calcularSalario(){
        return getSalarioBase() + adicional;
    }
}
