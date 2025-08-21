import java.util.*;

class Node {
    int data;
    List<Node> children;
    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class ContainsXinBT {
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

    public static boolean containsX(Node root, int x) {
        if (root == null) return false;
        if (root.data == x) return true;
        for (Node child : root.children) {
            if (containsX(child, x)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        int x = sc.nextInt();
        System.out.println(containsX(root, x));
    }
}
