import java.util.*;

public class MergingKSortestListusingPQ {
    static class Node {
        int value, listIndex, elementIndex;
        Node(int value, int listIndex, int elementIndex) {
            this.value = value;
            this.listIndex = listIndex;
            this.elementIndex = elementIndex;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            int n = sc.nextInt();
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(sc.nextInt());
            }
            lists.add(temp);
        }
        
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.value));
        
        for (int i = 0; i < k; i++) {
            if (!lists.get(i).isEmpty()) {
                minHeap.offer(new Node(lists.get(i).get(0), i, 0));
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        while (!minHeap.isEmpty()) {
            Node current = minHeap.poll();
            result.add(current.value);
            int nextIndex = current.elementIndex + 1;
            if (nextIndex < lists.get(current.listIndex).size()) {
                minHeap.offer(new Node(lists.get(current.listIndex).get(nextIndex), current.listIndex, nextIndex));
            }
        }
        
        for (int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
