package pedido.states;

import pedido.Pedido;

public class Finalizado implements StatusPedido {

    @Override
    public void prepare(Pedido pedido) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void ship(Pedido pedido) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void receive(Pedido pedido) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void complete(Pedido pedido) {
        System.out.println("O pedido já foi finalizado");
    }
}
