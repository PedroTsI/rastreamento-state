package pedido;

import pedido.states.StatusPedido;
import pedido.states.Preparando;

import java.util.Scanner;

import static util.Timeout.timeout;

public class Pedido {
    StatusPedido state;

    public Pedido() {
        state = new Preparando();
    }

    public StatusPedido getState() {
        return state;
    }

    public void setState(StatusPedido state) {
        this.state = state;
    }

    public void prepare() {
        state.prepare(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void receive() {
        state.receive(this);
    }

    public void complete() {
        state.complete(this);
    }

    public void flow() {
        this.prepare();
        timeout();

        this.ship();
        timeout();

        this.receive();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Você teve problema com seu pedido? (sim / não)");
        String feedback = scanner.nextLine();

        if (feedback.equalsIgnoreCase("sim")) {
            this.flow();
        } else {
            this.complete();
        }
    }
}
