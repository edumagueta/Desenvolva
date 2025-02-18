package POOI.aula9.src.service;

import POOI.aula9.src.modelo.Funcionario;

public class CalcularFeriasPJ implements ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() / 2;
    }


}
