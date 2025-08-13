import java.util.*;

public class SearchinBST {

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Insert into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    static Node search(Node root,int key){
         if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
    // In-order traversal
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of nodes
        Node root = null;
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        
        int id=sc.nextInt();
        Node foundNode=search(root,id);
        
        if(foundNode!= null){
            System.out.println("Book found! Subtree rooted at "+foundNode.data+":");
            inorder(foundNode);
        }else{
            System.out.println("Book not found");
        }
        sc.close();
    }
}
