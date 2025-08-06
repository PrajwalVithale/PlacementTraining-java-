import java.util.*;

public class DLLDeleteLastElement {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public Node head=null;
    public Node tail=null;
    
    public void Append(int data){
        Node newNode=new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    
    public void delete(){
        if(head==null && tail==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    
    public void printLL(){
        if(head==null && tail==null){
            System.out.print("List is empty");
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        DLLDeleteLastElement s=new DLLDeleteLastElement();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int d=sc.nextInt();
            s.Append(d);
        }
        s.delete();
        s.printLL();
        sc.close();
    }
}