import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class SumOfLeafNode {
    // Function to build tree from level-order input
    public static Node buildTree(int[] arr) {
        if (arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node current = q.poll();

            // Left child
            if (i < arr.length) {
                current.left = new Node(arr[i++]);
                q.add(current.left);
            }
            // Right child
            if (i < arr.length) {
                current.right = new Node(arr[i++]);
                q.add(current.right);
            }
        }
        return root;
    }

    // Function to sum all leaf nodes
    public static int sumOfLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.data;
        return sumOfLeafNodes(root.left) + sumOfLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Node root = buildTree(arr);
        System.out.println(sumOfLeafNodes(root));
    }
}
