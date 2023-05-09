package pedido.states;

import pedido.Order;

public class Preparing implements OrderState{
    @Override
    public void prepare(Order order){
        System.out.println("Pedido está sendo preparado");
    }

    @Override
    public void ship(Order order) {
        order.setState(new Shipping());
        System.out.println("Pedido está em trânsito");
    }

    @Override
    public void receive(Order order) {
        System.out.println("O Pedido não está em trânsito ainda");
    }

    @Override
    public void complete(Order order) {
        System.out.println("O Pedido não pode ser completo antes de ser recebido pelo destinatario");
    }
}
