import java.util.*;

class Node {
    int data;
    List<Node> children;
    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class CountLeafNodesinBT {
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

    public static int countLeaves(Node root) {
        if (root == null) return 0;
        if (root.children.isEmpty()) return 1;
        int count = 0;
        for (Node child : root.children) {
            count += countLeaves(child);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        System.out.println(countLeaves(root));
    }
}
