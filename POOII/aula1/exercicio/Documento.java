package POOII.aula1.exercicio;

public class Documento implements Imprimivel {
    private String texto;

    public Documento(String texto) {
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("Documento: " + texto);
    }
}