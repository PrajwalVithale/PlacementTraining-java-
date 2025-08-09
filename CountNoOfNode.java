import java.util.*;

public class CountNoOfNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

   static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);

        return root;
    }
    
    static Node buildTree(int[] values) {
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        return root;
    }
    
    static int count(Node root){
        if(root==null){
            return 0;
        }
        int lt=count(root.left);
        int rt=count(root.right);
        return lt+rt+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        Node root = buildTree(arr);
        System.out.println(count(root));
        sc.close();
    }
}