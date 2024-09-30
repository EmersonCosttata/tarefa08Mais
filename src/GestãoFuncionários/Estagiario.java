package GestãoFuncionários;

public class Dev extends Funcionario {
    public Dev(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularSalario() {
        return getSalario() + calcularBonus();
    }
    @Override
    public double calcularBonus() {
        return getSalario() * 0.3;  // Bônus de 20%
    }
}
