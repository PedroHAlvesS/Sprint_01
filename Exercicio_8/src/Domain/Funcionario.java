package Domain;

public class Funcionario {
    private String nome;
    private double salario;
    private double salarioLiquido;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void adicionarBonus(double bonus) {
        this.salarioLiquido = this.salario + bonus;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
