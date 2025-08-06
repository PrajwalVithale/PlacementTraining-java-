import java.util.*;

//using JCF
public class PrintingElementsFromMidUsingJCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Calculate mid
        int mid = list.size() / 2;

        for (int i = mid; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }
}
