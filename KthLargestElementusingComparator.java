import java.util.*;

public class KthLargestElementusingComparator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arg=new String[n];
        for(int i=0;i<n;i++){
            arg[i]=sc.next();
        }
        int k=sc.nextInt();
        Arrays.sort(arg,(a,b)->{
                   if(a.length() !=b.length()){
                       return b.length()-a.length();
                       }else{
                       return b.compareTo(a);
                   }
                });
        System.out.println(arg[k-1]);
        sc.close();
    }
}