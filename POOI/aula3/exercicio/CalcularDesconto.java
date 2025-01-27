package POOI.aula3.exercicio;

class CalcularDesconto {

    public double CalcularDesconto(Funcionario f1) {
        double desconto = 0;
        if (f1.dadosContratuais.salarioBase <= 2000.00) {
            desconto = f1.dadosContratuais.salarioBase * 0.10;
        } else if (f1.dadosContratuais.salarioBase > 2000.00 && f1.dadosContratuais.salarioBase <= 5000.00) {
            desconto = f1.dadosContratuais.salarioBase * 0.15;
        } else {
            desconto = f1.dadosContratuais.salarioBase * 0.20;
        }
        if (f1.dadosContratuais.valeTransporte && f1.dadosContratuais.salarioBase > 2500.00) {
            desconto += f1.dadosContratuais.salarioBase * 0.06;
        }
        return desconto;
    }
}
