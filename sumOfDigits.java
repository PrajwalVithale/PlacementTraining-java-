import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum+=rem;
        }
        System.out.println("sum of digits: "+sum);
        sc.close();
    }
}
