import java.util.*;

public class PrintingMaxFreqNumberusingMap {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int maxfeq=0;
        int res=Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int num=entry.getKey();
            int freq=entry.getValue();
            
            if(freq>maxfeq){
                maxfeq=freq;
                res=num;
            }else if(freq==maxfeq && num<res){
                res=num;
            }
        }
        System.out.println(res);
        sc.close();
    }
}