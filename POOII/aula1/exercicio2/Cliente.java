package POOII.aula1.exercicio2;

public class Cliente implements Autenticavel {
    private String cpf;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean autenticar(String cpfDigitado) {
        return this.cpf.equals(cpfDigitado);
    }
}
