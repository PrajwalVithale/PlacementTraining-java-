import java.util.*;

public class FindingMinNodeinBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static Node insert(Node root,int data){
        if(root==null) return new Node(data);
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    public static int cheapestNode(Node root){
        if(root==null) return 0;
        Node curr=root;
        while(curr.left!=null){
            curr=curr.left;
        }
        return curr.data;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=null;
        for(int i=0;i<x;i++){
            root=insert(root,sc.nextInt());
        }
        System.out.println(cheapestNode(root));
        sc.close();
    }
}