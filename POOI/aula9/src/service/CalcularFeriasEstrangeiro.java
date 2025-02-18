package POOI.aula9.src.service;

import POOI.aula9.src.modelo.Funcionario;

public class CalcularFeriasEstrangeiro implements ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 1.5;
    }
}
