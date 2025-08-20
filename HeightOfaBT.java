import java.util.*;

class Node {
    int data;
    List<Node> children;

    Node(int data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class HeightOfaBT {

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

    public static int getHeight(Node root) {
        if (root == null) return 0;

        int maxHeight = 0;
        for (Node child : root.children) {
            maxHeight = Math.max(maxHeight, getHeight(child));
        }
        return maxHeight + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = buildTree(sc);
        System.out.println(getHeight(root));
    }
}

