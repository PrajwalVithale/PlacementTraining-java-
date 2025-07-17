import java.util.Scanner;

public class discountProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many items:");
        int items=sc.nextInt();

        int total=items*452;
        System.out.println("Your current price: "+total);

        if(total>=5000){
            System.out.println("after discount: "+(total-(total*0.3)));
        }
        else{
            System.out.println("after discount: "+(total-(total*0.1)));
        }
        sc.close();
    }
}
