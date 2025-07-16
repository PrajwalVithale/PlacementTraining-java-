import java.util.Scanner;

public class SumandAvg {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
          int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("give input: ");
            arr[i]=sc.nextInt();
        }
         int sum=0;
         int avg;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            //System.out.print(arr[i]+" ");
        }
        avg=sum/(arr.length);
        System.out.println("Sum "+sum+" Avg "+avg);
        sc.close();
    }
}
