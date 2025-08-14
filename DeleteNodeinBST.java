import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DeleteNodeinBST {

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);
        return root;
    }

    // Find minimum value node
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a node
    public static Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found
            if (root.left == null && root.right == null) {
                return null; // No child
            } else if (root.left == null) {
                return root.right; // One child (right)
            } else if (root.right == null) {
                return root.left; // One child (left)
            } else {
                // Two children
                Node minNode = findMin(root.right);
                root.data = minNode.data;
                root.right = delete(root.right, minNode.data);
            }
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        int key = sc.nextInt();
        root = delete(root, key);

        inorder(root);
        sc.close();
    }
}
