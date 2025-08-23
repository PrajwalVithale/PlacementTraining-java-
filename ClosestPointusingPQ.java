import java.util.*;

public class ClosestPointusingPQ  {
    static class Point {
        int x, y;
        double dist;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
            this.dist = Math.sqrt(x * x + y * y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }
        int k = sc.nextInt();
        points.sort((a, b) -> Double.compare(a.dist, b.dist));
        for (int i = 0; i < k; i++) {
            System.out.println(points.get(i).x + " " + points.get(i).y);
        }
        sc.close();
    }
}
