import java.util.*;

public class MergeSortedLinkedLists {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return dummy.next;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        Node head1 = null;
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            head1 = addLast(head1, val);
        }

        int n2 = sc.nextInt();
        Node head2 = null;
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            head2 = addLast(head2, val);
        }

        Node mergedHead = merge(head1, head2);
        printList(mergedHead);
        sc.close();
    }
}