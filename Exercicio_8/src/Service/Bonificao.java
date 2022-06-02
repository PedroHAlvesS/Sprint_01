package Service;

import Domain.Funcionario;

public class Bonificao {

    public static double calculaBonificao(double salarioFuncionario) {
        double bonus = 0;
        if (salarioFuncionario <= 1000.0) {
            bonus = salarioFuncionario * 0.2;
        }
        if (salarioFuncionario > 1000.0 && salarioFuncionario <= 2000.0) {
            bonus = salarioFuncionario * 0.1;
        }
        if (salarioFuncionario > 2000) {
            bonus = salarioFuncionario * 0.1 * -1;
        }
        return bonus;
    }

}
