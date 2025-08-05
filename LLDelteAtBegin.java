import java.util.*;

public class LLDelteAtBegin {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleteAtBeginning(int num) {
        for (int i = 0; i < num && head != null; i++) {
            head = head.next;
        }
    }

   public void printLL() {
    Node curr = head;
    if (curr == null) {
        System.out.println("List is empty");
        return;
    }
    while (curr != null) {
        System.out.print(curr.data + " ");
        curr = curr.next;
    }
}

    public static void main(String[] args) {
        LLDelteAtBegin s = new LLDelteAtBegin();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int d = sc.nextInt();
            s.addLast(d);
        }

        int del = sc.nextInt();
        s.deleteAtBeginning(del);
        s.printLL();

        sc.close();
    }
}
