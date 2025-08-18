import java.util.*;

public class InvertingTheTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // Number of customers
        int[] tickets = new int[N];

        // Read ticket numbers
        for (int i = 0; i < N; i++) {
            tickets[i] = sc.nextInt();
        }

        // Reverse print
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(tickets[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
        
        sc.close();
    }
}
