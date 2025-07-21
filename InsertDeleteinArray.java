public class InsertDeleteinArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        //Delete
        int s=arr.length;
        int n=2;
        arr[n]=0;
        for(int i=n;i<s-1;i++){
            arr[i]=arr[i+1];
        }
        

        for(int i=0;i<s-1;i++){
            System.out.print(arr[i]+" ");
        }

        //insert
        int newArr[]=new int[s+1];
        int ele=60;
        int idx=2;

        for(int i=0,j=0;i<newArr.length;i++){
            if(i==idx){
                newArr[i]=ele;
            }else{
                newArr[i]=arr[j++];
            }
        }
        // System.out.println();
        // for(int i=0;i<newArr.length;i++){
        //     System.out.print(newArr[i]+" ");
        // }
    }
}
