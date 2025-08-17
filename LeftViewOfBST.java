import java.util.*;

public class LeftViewOfBST {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Node insert(Node root,int val){
        if(root==null) return new Node(val);
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    static int maxlevel=0;
    public static void leftView(Node root,int lev){
        if(root==null) return;
        if(lev>maxlevel){
            System.out.println(root.data);
            maxlevel=lev;
        }
        leftView(root.left,lev+1);
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        Node root=null;
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            root=insert(root,sc.nextInt());
        }
        leftView(root,1);
        sc.close();
    }
}
