package pedido;

import pedido.states.OrderState;
import pedido.states.Preparing;

import java.util.Scanner;

import static util.Timeout.timeout;

public class Order {
    OrderState state;

    public Order() {
        state = new Preparing();
    }

    public OrderState getsState() {
        return state;
    }

    public void setState(OrderState state) {
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
