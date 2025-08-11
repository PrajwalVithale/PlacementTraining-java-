import java.util.*;

public class DepthOfTree {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node buildTree(String[] values) {
        if (values.length == 0 || values[0].equals("null")) return null;

        Node root = new Node(Integer.parseInt(values[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty() && i < values.length) {
            Node current = q.poll();

            // Left child
            if (!values[i].equals("null")) {
                current.left = new Node(Integer.parseInt(values[i]));
                q.add(current.left);
            }
            i++;

            // Right child
            if (!values[i].equals("null")) {
                current.right = new Node(Integer.parseInt(values[i]));
                q.add(current.right);
            }
            i++;
        }

        return root;
    }
    
    
    static int Depth(Node root){
        if(root==null){
            return 0;
        }
        
        int ld=Depth(root.left);
        int rd=Depth(root.right);
        int maxDepth=Math.max(ld,rd)+1;
        return maxDepth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().trim().split(" ");

        Node root = buildTree(values);
        System.out.println(Depth(root));
        sc.close();
    }
}
