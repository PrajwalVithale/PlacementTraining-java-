import java.util.*;

public class LLaddInBetween {

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
    }
    
    public void addInbetween(int data,int pos){
         Node newNode=new Node(data);
         if(head==null){
            head=newNode;
            return;
        }
        if(pos==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            int i=0;
        Node curr=head;
        while(i<pos-2){
            curr=curr.next;
            i++;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        }
    }
    
    public void printLL(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        LLaddInBetween s=new LLaddInBetween();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int d=sc.nextInt();
            s.addLast(d);
        }
        int idx=sc.nextInt();
        int data=sc.nextInt();
        s.addInbetween(data,idx); 
        s.printLL();
        sc.close();
    }
}