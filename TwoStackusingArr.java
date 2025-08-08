import java.util.*;

public class TwoStackusingArr {
    static class TwoStacks {
        int size;
        int top1, top2;
        int[] arr;

        TwoStacks(int n) {
            size = n;
            arr = new int[n];
            top1 = -1;
            top2 = size;
        }

        void push1(int x) {
            if (top1 < top2 - 1) {
                top1++;
                arr[top1] = x;
            }
        }

        void push2(int x) {
            if (top1 < top2 - 1) {
                top2--;
                arr[top2] = x;
            }
        }

        int pop1() {
            if (top1 >= 0) {
                return arr[top1--];
            }
            return -1;
        }

        int pop2() {
            if (top2 < size) {
                return arr[top2++];
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TwoStacks ts = new TwoStacks(n);

        while (true) {
            int op = sc.nextInt();
            if (op == -1) break;

            switch (op) {
                case 1:
                    int x1 = sc.nextInt();
                    ts.push1(x1);
                    break;
                case 2:
                    int x2 = sc.nextInt();
                    ts.push2(x2);
                    break;
                case 3:
                    int res1 = ts.pop1();
                    if (res1 != -1) System.out.println(res1);
                    break;
                case 4:
                    int res2 = ts.pop2();
                    if (res2 != -1) System.out.println(res2);
                    break;
            }
        }
        sc.close();
    }
}
