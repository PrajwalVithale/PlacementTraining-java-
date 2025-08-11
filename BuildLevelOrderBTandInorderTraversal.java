import java.util.*;

public class BuildLevelOrderBTandInorderTraversal {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Inorder Traversal
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Build Tree from level order input
    static Node buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;

        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            Node current = q.poll();

            // Left child
            if (i < values.length && !values[i].equals("null")) {
                current.left = new Node(Integer.parseInt(values[i]));
                q.add(current.left);
            }
            i++;

            // Right child
            if (i < values.length && !values[i].equals("null")) {
                current.right = new Node(Integer.parseInt(values[i]));
                q.add(current.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int n = Integer.parseInt(sc.nextLine().trim());

        String[] values = sc.nextLine().trim().split(" ");

        Node root = buildTree(values);
        inorder(root);
        sc.close();
    }
}
