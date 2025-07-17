import java.util.Scanner;
public class salaryCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gender :'M' or 'F'");
        char gen=sc.nextLine().charAt(0);

        System.out.println("enter how many days he works");
        int days=sc.nextInt();

        if(gen=='F'){
            System.out.println("salary: "+(days*400));
        }
        else if(gen=='M'){
            System.out.println("salary: "+(days*350));
        }else{
            System.out.println("not Considered[]");
        }
        sc.close();;
    }
}
