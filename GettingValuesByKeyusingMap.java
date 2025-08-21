import java.util.*;

public class GettingValuesByKeyusingMap  {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),sc.nextInt());
        }
        
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int key=sc.nextInt();
            if(map.containsKey(key)){
                System.out.println(map.get(key));
            }else{
                 System.out.println("Employee not found");
            }
        }
        sc.close();
    }
}