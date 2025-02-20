package POOII.aula4.exercicio;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, 100.0);

        PedidoRepositorio repositorio = new PedidoRepositorio();
        Servico notificacao = new Servico();
        Entregas calculadoraEntrega = new Entregas();
        Recibo recibo = new Recibo();

        repositorio.salvarNoBanco(pedido);

        notificacao.enviarNotificacao(pedido);

        double taxa = calculadoraEntrega.calcularTaxaEntrega(pedido);
        System.out.println("Taxa de entrega: " + taxa);

        recibo.gerarRecibo(pedido);
    }
}