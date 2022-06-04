import Componente.Relatorio;
import Domain.Funcionario;
import Service.Bonificao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de funcionários");
        int quantidadeDeFuncionarios = Integer.parseInt(teclado.nextLine());
        // adiciona os funcionários ao vetor
        Funcionario[] funcionarios = Funcionario.adicionarFuncionariosAoSistema(quantidadeDeFuncionarios);
        // calculando a bonificação dos funcionários
        for (int i = 0; i < funcionarios.length; i++) {
            Bonificao.inseriBonificaoAoFuncionario(funcionarios[i]);
        }
        // imprimindo o relatório dos funcionários
        for (int i = 0; i < funcionarios.length; i++) {
            Relatorio.imprimiRelatorioDeUmFuncionario(funcionarios[i]);
        }
    }
}
