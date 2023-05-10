package pedido.states;

import pedido.Pedido;

public class Transporte implements StatusPedido {
    @Override
    public void prepare(Pedido pedido) {
        System.out.println("O pedido já está em trânsito pro destino");
    }

    @Override
    public void ship(Pedido pedido) {
        System.out.println("Pedido já em trânsito");
    }

    @Override
    public void receive(Pedido pedido) {
        pedido.setState(new Recebido());
        System.out.println("Pedido recebido pelo destinatario");
    }

    @Override
    public void complete(Pedido pedido) {
        System.out.println("O Pedido não pode ser completo antes de ser recebido pelo destinatario");
    }
}
