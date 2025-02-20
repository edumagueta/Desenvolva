package POOII.aula4.exercicio;

public class Entregas {
    public double calcularTaxaEntrega(Pedido pedido) {
        return pedido.getValor() * 0.1;
    }
}