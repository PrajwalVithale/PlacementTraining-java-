import java.util.*;

public class StackusingLL {
    
    static class Node {
        String bookname;
        Node next;

        public Node(String bookname) {
            this.bookname = bookname;
            this.next = null;
        }
    }

    static class Bookstack {
        private Node top;
        private int size;

        public Bookstack() {
            this.top = null;
            this.size = 0;
        }

        public void push(String bookname) {
            Node newNode = new Node(bookname);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public void pop() {
            if (top == null) {
                System.out.println("Stack Underflow");
            } else {
                top = top.next;
                size--;
            }
        }

        public void top() {
            if (top == null) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println(top.bookname);
            }
        }

        public void isEmpty() {
            System.out.println(top == null ? "true" : "false");
        }

        public void size() {
            System.out.println(size);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Bookstack stack = new Bookstack();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            if (line.startsWith("Push")) {
                String[] parts = line.split(" ", 2);
                stack.push(parts[1]);
            } else if (line.equals("Pop")) {
                stack.pop();
            } else if (line.equals("Top")) {
                stack.top();
            } else if (line.equals("Size")) {
                stack.size();
            } else if (line.equals("IsEmpty")) {
                stack.isEmpty();
            }
        }
        sc.close();
    }
}
