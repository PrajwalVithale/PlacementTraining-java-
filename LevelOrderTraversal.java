import java.util.*;

public class LevelOrderTraversal {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    
    static void levelOrder(Node root){
        if(root==null) return;
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            root=insert(root,d);
        }
        
        levelOrder(root);
        sc.close();
    }
}