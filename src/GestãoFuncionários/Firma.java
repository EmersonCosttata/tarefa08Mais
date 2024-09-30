package GestãoFuncionários;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;
    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calculaFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularSalario();
            System.out.println(funcionario.getNome() + " - Salário: R$" + salario);
            total += salario;
        }
        return total;
    }

    public void promoverFuncionario(Funcionario funcionario) {
        switch (funcionario){
            System.out.println("Promovendo estagiário " + funcionario.getNome() + " para dev.");
            Funcionario novoFuncionario = new Dev(funcionario.getNome(), funcionario.getSalario());
            funcionarios.remove(funcionario);
            funcionarios.add(novoFuncionario);
            
            System.out.println("Promovendo desenvolvedor " + funcionario.getNome() + " para gerente.");
            Funcionario novoFuncionario = new Gerente(funcionario.getNome(), funcionario.getSalario());
            funcionarios.remove(funcionario);
            funcionarios.add(novoFuncionario);

            System.out.println("Funcionário " + funcionario.getNome() + " já é gerente.");
            }
    }
}
