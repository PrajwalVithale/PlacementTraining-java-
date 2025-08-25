import java.util.*;

public class ChcekEleContainsFromoneSetTonaother {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int order[]=new int[n];
        int inventory[]=new int[m];
        for(int i=0;i<n;i++){
            order[i]=sc.nextInt();
        }
        
        for(int j=0;j<m;j++){
            inventory[j]=sc.nextInt();
        }
        
        HashSet<Integer> set=new HashSet<>();
        for(int u: order){
            set.add(u);
        }
         HashSet<Integer> set2=new HashSet<>();
        for(int v: inventory){
            set2.add(v);
        }
        if(set.containsAll(set2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
