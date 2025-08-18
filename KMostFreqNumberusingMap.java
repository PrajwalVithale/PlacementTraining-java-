import java.util.*;

public class KMostFreqNumberusingMap{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            p[i]=sc.nextInt();
        }
        
        int k=sc.nextInt();
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int q:p){
            map.put(q,map.getOrDefault(q,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return b.getValue()-a.getValue();
            }else{
                return b.getKey()-a.getKey();
            }
        });
        
        for(int i=0;i<k && i<list.size();i++){
            System.out.print(list.get(i).getKey()+" ");
        }
        sc.close();
    }
}