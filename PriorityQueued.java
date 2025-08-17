import java.util.*;

public class PriorityQueued {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(1,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(sc.nextInt());
        }
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int max=pq.poll();
            pq.add((int)Math.sqrt(max));
        }
        
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        System.out.println(sum);
        sc.close();
    }
}