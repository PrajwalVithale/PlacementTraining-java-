import java.util.Scanner;

public class LoopsWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=500;
        int sum=0;
        int count=0;
        while(sum<x){
            System.out.println("enter cost item: ");
            int n=sc.nextInt();
            System.out.println("number of items : ");
            int c=sc.nextInt();
            int y=n*c;
            sum=sum+y;
            count++;
        }

        System.out.println("No items Purchased: "+count);
        sc.close();
    }
}
