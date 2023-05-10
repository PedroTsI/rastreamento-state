package pedido.states;

import pedido.Pedido;

public interface StatusPedido {
    void prepare(Pedido pedido);
    void ship(Pedido pedido);
    void receive(Pedido pedido);
    void complete(Pedido pedido);

}
