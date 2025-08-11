import java.util.*;

public class SwapAdjacentNodes {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

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

    public Node swapPairs(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while (head != null && head.next != null) {
            Node first = head;
            Node second = head.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            head = first.next;
        }

        return dummy.next;
    }

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapAdjacentNodes list = new SwapAdjacentNodes();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(sc.nextInt());
        }

        Node swappedHead = list.swapPairs(list.head);
        list.printList(swappedHead);
        sc.close();
    }
} 