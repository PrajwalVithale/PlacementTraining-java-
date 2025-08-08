import java.util.*;

public class TempWarmerthantoday{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }

        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        
        for (int r : result) {
            System.out.print(r + " ");
        }
        sc.close();

    }
}