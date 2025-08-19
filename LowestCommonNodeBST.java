import java.util.*;

public class LowestCommonNodeBST {
    static class Node{
        int val;
        Node right,left;
        Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    
   static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
    
     public static Node findLCA(Node root, int p, int q) {
        if (root == null) return null;
        if (root.val == p || root.val == q) return root;
        
        Node left = findLCA(root.left, p, q);
        Node right = findLCA(root.right, p, q);
        
        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, sc.nextInt());
        }

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        
        Node lca = findLCA(root, x1,x2);
        
        if (lca != null) {
            System.out.println(lca.val);
        }
        sc.close();
    }
}   