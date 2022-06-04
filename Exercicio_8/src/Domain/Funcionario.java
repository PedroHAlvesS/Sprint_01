package Domain;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private double salario;
    private double salarioLiquido;
    private double bonus;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void adicionarBonus(double bonus) {
        this.bonus = bonus;
        this.salarioLiquido = this.salario + bonus;
    }

    public static Funcionario[] adicionarFuncionariosAoSistema(int quantidadeDeFuncionarios) {
        Funcionario[] funcionarios = new Funcionario[quantidadeDeFuncionarios];
        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = Funcionario.lerDadosDoFuncionario();
        }
        return funcionarios;
    }

    private static Funcionario lerDadosDoFuncionario() {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionarioTemp;
        System.out.println("Informe o nome do funcionário: ");
        String nomeTemp = teclado.nextLine();
        System.out.println("Informe o salario do funcionário: ");
        double salarioTemp = Double.parseDouble(teclado.nextLine());
        funcionarioTemp = new Funcionario(nomeTemp, salarioTemp);
        return funcionarioTemp;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public double getBonus() {
        return bonus;
    }
}
