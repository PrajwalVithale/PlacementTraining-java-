import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
    }
}

public class SumRootToLeaf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine().trim()); // Number of nodes
        String[] arr = sc.nextLine().trim().split(" ");

        Node root = buildTree(arr);
        int sum = sumRootToLeaf(root, 0);
        System.out.println(sum);
        sc.close();
    }

    public static Node buildTree(String[] arr) {
        if (arr.length == 0 || arr[0].equalsIgnoreCase("null")) return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            // Left child
            if (i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && !arr[i].equalsIgnoreCase("null")) {
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static int sumRootToLeaf(Node root, int current) {
        if (root == null) return 0;

        current = current * 10 + root.val;

        // Leaf node
        if (root.left == null && root.right == null) {
            return current;
        }

        return sumRootToLeaf(root.left, current) + sumRootToLeaf(root.right, current);
    }
}
