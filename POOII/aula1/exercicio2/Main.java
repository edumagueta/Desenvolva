package POOII.aula1.exercicio2;

public class Main {
    public static void main(String[] args) {
        Autenticavel admin = new Administrador();
        Autenticavel cliente = new Cliente("123.456.789-00");

        System.out.println("Admin autenticado? " + admin.autenticar("admin123"));
        System.out.println("Cliente autenticado? " + cliente.autenticar("123.456.789-00"));
    }
}