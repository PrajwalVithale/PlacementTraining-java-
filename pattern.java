public class pattern {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     System.out.println();
        //     for(int j=1;j<=10;j=j+2){
        //         System.out.print(j+" ");
        //     }
        // }

        // for(int i=1;i<=5;i++){
        //      System.out.println();
        //      for(int j=1;j<=i;j++){
        //          System.out.print("*"+" ");
        //      }
        // }

        // for(char i='A';i<='D';i++){
        //      System.out.println();
        //      for(char j='A';j<=i;j++){
        //          System.out.print(j+" ");
        //      }
        // }
        
        for(int i=1;i<=5;i++){
            System.out.println();
            for(int j=4;j>=i;j--){
                System.out.print(" "+" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
}
