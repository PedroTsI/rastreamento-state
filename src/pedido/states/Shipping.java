package pedido.states;

import pedido.Order;

public class Shipping implements OrderState{
    @Override
    public void prepare(Order order) {
        System.out.println("O pedido já está em trânsito pro destino");
    }

    @Override
    public void ship(Order order) {
        System.out.println("Pedido já em trânsito");
    }

    @Override
    public void receive(Order order) {
        order.setState(new Received());
        System.out.println("Pedido recebido pelo destinatario");
    }

    @Override
    public void complete(Order order) {
        System.out.println("O Pedido não pode ser completo antes de ser recebido pelo destinatario");
    }
}
