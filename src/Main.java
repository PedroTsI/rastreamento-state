import pedido.Pedido;

import java.util.Scanner;

import static util.Timeout.timeout;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de fazer um pedido?? (sim / não)");
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("sim")) {
            System.out.println("Até Mais!");
            return;
        }

        System.out.println("Fazendo Pedido...");
        timeout();

        Pedido pedido = new Pedido();

        pedido.flow();
    }
}