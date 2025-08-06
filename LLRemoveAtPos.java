import java.util.*;

public class LLRemoveAtPos {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();  // number of elements
        for (int i = 0; i < x; i++) {
            int d = sc.nextInt();
            list.addLast(d);
        }

        int pos = sc.nextInt();  // position to delete (1-based)

        if (pos >= 1 && pos <= list.size()) {
            list.remove(pos - 1);
        }

        if (list.size() == 0) {
            System.out.print("List is empty");
        } else {
            for (int i : list) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
