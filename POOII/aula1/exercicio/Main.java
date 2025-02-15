package POOII.aula1.exercicio;

public class Main {
    public static void main(String[] args) {
        Imprimivel doc = new Documento("Este é um documento");
        Imprimivel rel = new Relatorio("Relatório da Aula", "Conteúdo de POO");

        doc.imprimir();
        rel.imprimir();
    }
}