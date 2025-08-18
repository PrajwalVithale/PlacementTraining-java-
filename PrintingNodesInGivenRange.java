import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PrintingNodesInGivenRange {

    // Insert into BST
    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    // Trim BST
    static Node trimBST(Node root, int low, int high) {
        if (root == null) return null;

        // If value is less than low, discard left subtree
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }

        // If value is greater than high, discard right subtree
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }

        // Otherwise, keep current node and trim subtrees
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }

    // Pre-order traversal
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of nodes
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int low = sc.nextInt();
        int high = sc.nextInt();

        root = trimBST(root, low, high);
        preorder(root);
        sc.close();
    }
}
