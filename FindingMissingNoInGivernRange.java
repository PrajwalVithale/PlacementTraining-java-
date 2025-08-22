import java.util.*;
public class FindingMissingNoInGivernRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int arr[] = new int[y];
        for (int i = 0; i < y; i++) {
            arr[i] = sc.nextInt();
        }

        int S = sc.nextInt();
        int E = sc.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        for (int i = S; i <= E; i++) {
            if (!set.contains(i)) {
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}

