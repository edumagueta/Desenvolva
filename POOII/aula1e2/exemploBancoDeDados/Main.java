package POOII.aula1e2.exemploBancoDeDados;

public class Main {

    public static void main(String[] args) {
        Pessoa pedro = new Pessoa();
        BancoDeDados bancoDeDados = new BancoXPTO();
        bancoDeDados.salvar(pedro);
    }
}
