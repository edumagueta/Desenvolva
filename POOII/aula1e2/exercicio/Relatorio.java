package POOII.aula1e2.exercicio;

public class Relatorio implements Imprimivel {
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Relatório");
        System.out.println("Título: " + titulo);
        System.out.println(conteudo);
    }
}