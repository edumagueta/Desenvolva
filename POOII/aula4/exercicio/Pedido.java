package POOII.aula4.exercicio;

public class Pedido {
    private int id;
    private double valor;

    public Pedido(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }
}