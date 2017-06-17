package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa empresa = new Empresa();

        System.out.println("Informe a quantidade de funcionarios que deseja adicionar:");
        int qtd = sc.nextInt();
        empresa.setQtdFuncionarios(qtd);

        for (int i = 0; i < qtd; i++) {
            Funcionario funcionario = new Funcionario();

            System.out.println("Funcionario: " + (i + 1));
            System.out.println("Nome: ");
            String nome = sc.next();
            funcionario.setNome(nome);

            System.out.println("Cargo: ");
            String cargo = sc.next();
            funcionario.setCargo(cargo);

            empresa.adcFuncionario(i, funcionario);
        }

        empresa.listarFuncionarios();
    }
}
