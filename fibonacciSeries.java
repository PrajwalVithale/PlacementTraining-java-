public class fibonacciSeries {
    public static void main(String[] args) {
        int x=0,y=1;
        int n=555;
        System.out.print("sereis "+x+" "+y+" ");
        while(x<n){
            int next=x+y;
            x=y;
            y=next;
            System.out.print(next+" ");
        }
        
    }
}
