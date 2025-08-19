//import java.io.*;
import java.util.*;

public class CheckingKeyInMap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),sc.nextLine());
        }
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int key=sc.nextInt();
            if(map.containsKey(key)){
                System.out.println(map.get(key).trim());
            }else{
                System.out.println("Order not found");
            }
        }
        sc.close();
    }
}
