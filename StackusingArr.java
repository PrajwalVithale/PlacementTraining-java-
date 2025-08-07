import java.util.*;

public class StackusingArr {    
    static class Stack{
        private int[] stack;
        private int top;
        private final int capacity;
        
        public Stack(int capacity){
            this.capacity=capacity;
            this.stack=new int[capacity];
            this.top=-1;
        }
        
        public void push(int x){
            if(top < capacity - 1){
                stack[++top] = x;
            } else {
                System.out.println("Stack Overflow");
            }
        }
        
        public void pop() {
            if (isEmptyInternal()) {
                System.out.println("Stack Underflow");
                return;
            }else{
                top--;
            }
        }
        public void isEmpty(){
            if(isEmptyInternal()){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    
        public void size(){
            System.out.println(top+1);
        }
        
        public void top() {
    if (isEmptyInternal()) {
        System.out.println("Stack Empty");
        return;
    }
    System.out.println(stack[top]);
}

        
        public boolean isEmptyInternal(){
            return top==-1;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.nextLine());
        Stack st = new Stack(100);

        for (int i = 0; i < q; i++) {
            String line = sc.nextLine();
            if (line.startsWith("Push")) {
                int x = Integer.parseInt(line.split(" ")[1]);
                st.push(x);
            } else if (line.equals("Pop")) {
                st.pop();
            } else if (line.equals("Top")) {
                st.top();
            } else if (line.equals("Size")) {
                st.size();
            } else if (line.equals("IsEmpty")) {
                st.isEmpty();
            }
        }
        sc.close();
    }
}