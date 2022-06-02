package Componente;

import Domain.Funcionario;

public class Relatorio {
    public static void imprimiRelatorioDoSalarioDoFuncionario(Funcionario funcionario) {
        System.out.println("--------------");
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        Relatorio.imprimiBonusDoFuncionario(funcionario);
        System.out.println("Salário Líquido: " + funcionario.getSalarioLiquido());
        System.out.println("--------------");
    }

    public static void imprimiBonusDoFuncionario(Funcionario funcionario) {
        if (funcionario.getBonus() < 0) {
            System.out.println("Desconto: " + funcionario.getBonus());
        } else {
            System.out.println("Bonus: " + funcionario.getBonus());
        }
    }
}
