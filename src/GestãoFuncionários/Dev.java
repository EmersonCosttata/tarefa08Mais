package GestãoFuncionários;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularSalario() {
        return getSalario() + calcularBonus();
    }
    @Override
    public double calcularBonus() {
        return getSalario() * 0.5;  // Bônus de 20%
    }
}
