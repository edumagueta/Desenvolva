package POOII.aula1e2.exemploBancoDeDados;

public class BancoOracle implements BancoDeDados{
    @Override
    public void salvar(Pessoa pessoa) {
        System.out.println("Solicitar usuario");
        System.out.println("Recuperar uma lib de conexão");
    }



    @Override
    public void excluir(Pessoa pessoa) {

    }
}
