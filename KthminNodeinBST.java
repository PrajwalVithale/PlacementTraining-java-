import java.util.*;

public class KthminNodeinBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static int count = 0; // counter for inorder steps
    static int result = -1; 
    
    public static Node insert(Node root,int data){
        if(root==null) return new Node(data);
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
     public static void findKthMin(Node root, int k) {
        if (root == null || result != -1) return; // stop if found

        findKthMin(root.left, k);
        count++;
        if (count == k) {
            result = root.data;
            return;
        }
        findKthMin(root.right, k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=null;
        for(int i=0;i<x;i++){
            root=insert(root,sc.nextInt());
        }
        int k=sc.nextInt();
        findKthMin(root,k);
        System.out.println(result);
        sc.close();
    }
}       