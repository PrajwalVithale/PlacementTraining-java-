import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ZigzagLevelOrderTraversal {
    public static Node buildTree(int[] arr) {
        if (arr.length == 0) return null;

        Node root = new Node(arr[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            Node current = q.poll();

            if (i < arr.length) {
                current.left = new Node(arr[i++]);
                q.add(current.left);
            }

            if (i < arr.length) {
                current.right = new Node(arr[i++]);
                q.add(current.right);
            }
        }
        return root;
    }

    public static void zigzagLevelOrder(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true; // flag to control direction

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            // reverse the level if direction is right-to-left
            if (!leftToRight) {
                Collections.reverse(level);
            }

            // print the level
            for (int val : level) {
                System.out.print(val + " ");
            }
            System.out.println();

            leftToRight = !leftToRight; // switch direction
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Node root = buildTree(arr);
        zigzagLevelOrder(root);
    }
}
