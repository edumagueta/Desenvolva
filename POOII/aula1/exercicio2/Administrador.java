package POOII.aula1.exercicio2;

public class Administrador implements Autenticavel {
    private static final String SENHA_ADMIN = "admin123";

    @Override
    public boolean autenticar(String senha) {
        return SENHA_ADMIN.equals(senha);
    }
}