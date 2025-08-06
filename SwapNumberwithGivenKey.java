import java.util.*;

public class SwapNumberwithGivenKey {
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
    
    public void Swap(int k,int n){
        if(k<1 || k>n){
            return;
        }
        Node first=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        
        Node second=head;
        for(int i=1;i<n-k+1;i++){
            second=second.next;
        }
        
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
    }
    
    public void printLL(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    } 

    public static void main(String[] args) {
        SwapNumberwithGivenKey s=new SwapNumberwithGivenKey();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int d=sc.nextInt();
            s.addLast(d);
        }
        int y=sc.nextInt();
        s.Swap(y,x);
        s.printLL();
        sc.close();
    }
}