package ex4;

public class Empresa {

    private Funcionario[] funcionarios;

    public void setQtdFuncionarios(int qtd) {
        funcionarios = new Funcionario[qtd];
    }

    public void adcFuncionario(int posicao, Funcionario funcionario) {
        funcionarios[posicao] = funcionario;
    }

    public void listarFuncionarios() {
        if (funcionarios != null) {
            for (Funcionario fun : this.funcionarios) {
                System.out.println(fun.toString());
            }
        }
    }
}
