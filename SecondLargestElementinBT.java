import java.util.*;

class Node {
    int data;
    List<Node> children;
    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class SecondLargestElementinBT {
    public static Node buildTree(Scanner sc) {
        int rootData = sc.nextInt();
        Node root = new Node(rootData);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int childCount = sc.nextInt();
            for (int i = 0; i < childCount; i++) {
                int childData = sc.nextInt();
                Node child = new Node(childData);
                current.children.add(child);
                queue.add(child);
            }
        }
        return root;
    }

    public static int[] findLargestAndSecond(Node root) {
        int[] res = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (cur.data > res[0]) {
                res[1] = res[0];
                res[0] = cur.data;
            } else if (cur.data > res[1] && cur.data < res[0]) {
                res[1] = cur.data;
            }
            for (Node c : cur.children) q.add(c);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        int[] ans = findLargestAndSecond(root);
        System.out.println(ans[1]);
    }
}

