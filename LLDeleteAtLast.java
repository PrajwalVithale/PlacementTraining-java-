import java.util.*;

public class LLDeleteAtLast {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    public Node head=null;
    
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
    public void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null; 
    } 
    
    public void printLL(){
        if(head==null){
            System.out.print("List is empty");
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        LLDeleteAtLast s=new LLDeleteAtLast();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int d=sc.nextInt();
            s.addLast(d);
        }
        int num=sc.nextInt();
            for(int i=0;i<num;i++){
                s.deleteAtEnd();
            }
        s.printLL();
        sc.close();
    }
}