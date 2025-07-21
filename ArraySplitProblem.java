public class ArraySplitProblem {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,9,5,7,8,1,20,79,-85,658,952,-59763};
        int n=arr.length/2;
       int firstArr[]=new int[n];
       int secondArr[]=new int[n];
       

       for(int i=0;i<arr.length/2;i++){
            firstArr[i]=arr[i];
       }
       for(int i=0;i<arr.length/2;i++){
            secondArr[i]=arr[n+i];
       }

       for(int i=0;i<firstArr.length;i++){
        System.out.print(firstArr[i]+" ");
       }
       System.out.println();
       for(int i=0;i<secondArr.length;i++){
        System.out.print(secondArr[i]+" ");
       }
    }
}
