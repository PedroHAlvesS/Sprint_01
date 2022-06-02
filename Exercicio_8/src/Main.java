import Domain.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de funcionários");
        int quantidadeDeFuncionarios = Integer.parseInt(teclado.nextLine());

        Funcionario[] funcionarios = new Funcionario[quantidadeDeFuncionarios];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Informe o nome do funcionário: ");
            String nomeTemp = teclado.nextLine();
            System.out.println("Informe o salario do funcionário: ");
            double salarioTemp = Double.parseDouble(teclado.nextLine());
            funcionarios[i] = new Funcionario(nomeTemp, salarioTemp);
        }
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println(funcionarios[i].getNome());
            System.out.println(funcionarios[i].getSalario());
        }
    }
}
