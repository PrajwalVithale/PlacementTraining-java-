import java.util.Scanner;

public class gradeProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub=5;
        System.out.println("enter subject marks out of 100 "+sub+" inputs");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int sum=a+b+c+d+e;
        System.out.println("sum "+sum);
        int  avg=sum/sub;
         System.out.println("avg "+avg);

        if(avg>90 && avg<=100){
            System.out.println("Distinction "+avg);
        }
        else if(avg>70 && avg<=90){
            System.out.println("First class");
        }
         else if(avg>50 && avg<=70){
            System.out.println("Second class");
        }
         else if(avg>35 && avg<=50){
            System.out.println("Third class");
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
