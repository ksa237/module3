import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Deque<String> clients = new ArrayDeque<>();
        clients.addAll(firstClients);

        while (!clients.isEmpty()) {
            String client = clients.poll();
            System.out.println(client+" сделала новый маникюр.");
            if (Math.random() < 0.5) {
                clients.offerLast("friend of "+ client);
            }
        }
    }

}
