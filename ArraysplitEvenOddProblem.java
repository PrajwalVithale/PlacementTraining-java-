public class ArraysplitEvenOddProblem {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,9,7,8,1,20,79,-85,658,952,-59763};

        int even=0;
        int odd=0;
        int evenarr[]=new int[arr.length];
        int oddarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenarr[even++]=arr[i];
            }else{
                oddarr[odd++]=arr[i];
            }
        }
        

        System.out.println();
        for(int i=0;i<even;i++){
            System.out.print(evenarr[i]+" ");
        }
        System.out.println();
         for(int i=0;i<odd;i++){
            System.out.print(oddarr[i]+" ");
        }

    }
}
