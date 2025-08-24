import java.util.*;

public class TargetSumfromrootToLeaf {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    public static Node insert(Node root,int val){
        if(root==null) return new Node(val);
        if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    
    public static boolean pathSum(Node root,int tar){
        if(root == null) return false;
        if(root.left==null && root.right==null){
            return tar==root.data;
        }
        return pathSum(root.left,tar-root.data) || pathSum(root.right,tar-root.data);
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Node root=null;
        for(int i=0;i<x;i++){
            root=insert(root,sc.nextInt());
        }
        int tar=sc.nextInt();
        System.out.println(pathSum(root,tar));
        sc.close();
    }
}
