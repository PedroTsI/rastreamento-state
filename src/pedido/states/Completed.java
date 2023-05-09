package pedido.states;

import pedido.Order;

public class Completed implements OrderState{

    @Override
    public void prepare(Order order) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void ship(Order order) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void receive(Order order) {
        System.out.println("O pedido já foi finalizado");
    }

    @Override
    public void complete(Order order) {
        System.out.println("O pedido já foi finalizado");
    }
}
