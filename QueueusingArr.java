import java.util.*;

public class QueueusingArr{
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
    
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    
    public void printLL(){
        if(head==null){
            System.out.print("List is Empty");
        }
        Node curr=head;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        }while(curr!=head);
    }

    public static void main(String[] args) {
        QueueusingArr s=new QueueusingArr();
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