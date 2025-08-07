import java.util.*;

public class ReverseLL {
    class Node{
        String data;
        Node next;
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head=null;
    public void addLast(String data){
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
    public Node reverseList(){
        if(head==null){
            return null;
        }
        if(head.next==null){
            return head;
        }

        Node prev=null;
        Node curr=head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    
    public void printLL(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL s=new ReverseLL();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=x;i++){
            s.addLast(sc.nextLine());
        }
        Node head=s.reverseList();
        
        s.printLL(head);
        sc.close();
    }
}