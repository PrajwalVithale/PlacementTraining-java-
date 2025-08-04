import java.util.*;

public class LLaddLast {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
        //head=newNode;
    }
    
    public void printLL(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        LLaddLast s=new LLaddLast();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int d=sc.nextInt();
            s.addLast(d);
        }
        
        s.printLL();
        sc.close();
    }
}