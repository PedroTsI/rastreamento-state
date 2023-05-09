package pedido.states;

import pedido.Order;

public class Received implements OrderState{
    @Override
    public void prepare(Order order) {
        System.out.println();
    }

    @Override
    public void ship(Order order) {
        System.out.println("O Pedido já chegou ao destino");
    }

    @Override
    public void receive(Order order) {
        System.out.println("Pedido recebido pelo destinatario");
    }

    @Override
    public void complete(Order order) {
        order.setState(new Completed());
        System.out.println("Pedido Finalizado.");
    }
}
