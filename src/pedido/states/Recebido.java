package pedido.states;

import pedido.Pedido;

public class Recebido implements StatusPedido {
    @Override
    public void prepare(Pedido pedido) {
        System.out.println();
    }

    @Override
    public void ship(Pedido pedido) {
        System.out.println("O Pedido já chegou ao destino");
    }

    @Override
    public void receive(Pedido pedido) {
        System.out.println("Pedido recebido pelo destinatario");
    }

    @Override
    public void complete(Pedido pedido) {
        pedido.setState(new Finalizado());
        System.out.println("Pedido Finalizado.");
    }
}
