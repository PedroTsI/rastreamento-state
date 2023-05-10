package pedido.states;

import pedido.Pedido;

public class Preparando implements StatusPedido {
    @Override
    public void prepare(Pedido pedido){
        System.out.println("Pedido está sendo preparado");
    }

    @Override
    public void ship(Pedido pedido) {
        pedido.setState(new Transporte());
        System.out.println("Pedido está em trânsito");
    }

    @Override
    public void receive(Pedido pedido) {
        System.out.println("O Pedido não está em trânsito ainda");
    }

    @Override
    public void complete(Pedido pedido) {
        System.out.println("O Pedido não pode ser completo antes de ser recebido pelo destinatario");
    }
}
