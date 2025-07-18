import java.util.*;

public class SumNumber {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(;sum<700;){
            System.out.println("Enter number: ");
            int n=sc.nextInt();
            sum=sum+n;
            System.out.print(sum+" is ");
        }
        System.out.println("\nsum is greater than recquirement ");
        sc.close();
    }    
}
