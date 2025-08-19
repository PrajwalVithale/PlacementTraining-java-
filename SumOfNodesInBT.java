import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

// Defines a node for the generic tree
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;

    TreeNode(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }
}

public class SumOfNodesInBT {
    public static TreeNode<Integer> takeInputLevelWise(Scanner sc) {
        // The first number is the root's data
        if (!sc.hasNextInt()) {
            return null; // Handle case with no input
        }
        int rootData = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            TreeNode<Integer> currentNode = pendingNodes.poll();
            int numChildren = sc.nextInt();
            for (int i = 0; i < numChildren; i++) {
                int childData = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                currentNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }
    public static int sumOfAllNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int totalSum = root.data;

        for (TreeNode<Integer> child : root.children) {
            totalSum += sumOfAllNodes(child);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Build the tree from input
        TreeNode<Integer> root = takeInputLevelWise(sc);
        
        // 2. Calculate the sum of its nodes
        int result = sumOfAllNodes(root);
        
        // 3. Print the final result
        System.out.println(result);
        
        sc.close();
    }
}