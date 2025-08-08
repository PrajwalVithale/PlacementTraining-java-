import java.util.*;

public class QueueOperationusingJCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();

            if (command.startsWith("push")) {
                int val = Integer.parseInt(command.split(" ")[1]);
                queue.add(val);
                System.out.println("Order added: " + val);
            } else if (command.equals("pop")) {
                if (!queue.isEmpty()) {
                    System.out.println("Order processed: " + queue.poll());
                } else {
                    System.out.println("No order to process");
                }
            } else if (command.equals("peek")) {
                if (!queue.isEmpty()) {
                    System.out.println("Next order: " + queue.peek());
                } else {
                    System.out.println("No orders in queue");
                }
            } else if (command.equals("empty")) {
                System.out.println("Is queue empty: " + queue.isEmpty());
            }
        }

        sc.close();
    }
}
