import java.util.*;

public class DistinctSubarrayswithKSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            if (right - left + 1 > k) {
                int leftVal = arr[left];
                freq.put(leftVal, freq.get(leftVal) - 1);
                if (freq.get(leftVal) == 0) {
                    freq.remove(leftVal);
                }
                left++;
            }
            
            if (right - left + 1 == k) {
                System.out.println(freq.size());
            }
        }
        
        sc.close();
    }
}

