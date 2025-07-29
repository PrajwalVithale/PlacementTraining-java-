// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SubArrProblem{
    public static void main(String[] args) {
        int arr[]={0,0,1,1,2,3,5,6,5};
        //System.out.println("Try programiz.pro");
        int arr1[]=new int[arr.length];
        int arr2[]=new int[arr.length];
        int k=0;
        int n=0;
        int m=0;
        for(int j=k+1;j<arr.length;j++){
            if(arr[k]!=arr[j]){
                arr1[n++]=arr[k];
                k++;
            }else{
                arr2[m++]=arr[k];
                k++;
            }
        }
        arr2[m++]=arr[arr.length-1];
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}