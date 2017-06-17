package ex4;

public class Funcionario {

    private String nome;
    private String cargo;
    private Funcionario superior;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario: " + this.nome + ", Cargo: " + this.cargo;
    }
}
