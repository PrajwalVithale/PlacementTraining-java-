import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class SumOfLeftLeafNodesinBT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(sc.nextLine());
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = buildTree(nodes);
        System.out.println(sumOfLeftLeaves(root));
        sc.close();
    }

    static TreeNode buildTree(String[] nodes) {
        if (nodes.length == 0 || nodes[0].equals("null")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (!q.isEmpty() && i < nodes.length) {
            TreeNode curr = q.poll();
            if (!nodes[i].equals("null")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                q.add(curr.left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("null")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }

    static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }
        return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
