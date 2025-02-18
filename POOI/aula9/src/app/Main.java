package POOI.aula9.src.app;

import POOI.aula9.src.modelo.Funcionario;
import POOI.aula9.src.modelo.TipoFuncionario;
import POOI.aula9.src.service.ServicoDeCalculoDeFeriasFactory;
import POOI.aula9.src.service.ServicoDeCalculoFerias;

public class Main {

    public static void main(String[] args) {

        String nome = args[0];

        TipoFuncionario tipo = TipoFuncionario.values()[Integer.valueOf(args[1]) - 1];

        double salario = Double.valueOf(args[2]);

        Funcionario funcionario = new Funcionario(nome, tipo, salario);

        ServicoDeCalculoFerias calculoFerias = ServicoDeCalculoDeFeriasFactory.obterLogicaDeCalculo(funcionario.getTipo());

        double ferias = calculoFerias.calcularFerias(funcionario);

        System.out.println(ferias);

    }

}
