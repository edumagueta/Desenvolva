package POOI.aula9.src.service;

import POOI.aula9.src.modelo.Funcionario;

public class CalcularFeriasCLT implements service.ServicoDeCalculoFerias {

    public double calcularFerias(Funcionario funcionario) {
        return funcionario.getSalario() * 2;
    }
}

// Classe pai/mae
// Classe filha herdar todos os attr & comportamentos

// NAO USE HERANçA, use composição ao inves