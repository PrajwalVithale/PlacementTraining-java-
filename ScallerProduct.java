import java.util.*;
class ScallerProduct{
    public static void main(String argsp[]){
        Integer arr1[]={1,3,2,9};
        Integer arr2[]={5,6,8,1};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());
        int val=0;
        
        for(int i=0;i<arr1.length;i++){
            val+=arr1[i]*arr2[i];
        }
        System.out.println(val);
    }
}