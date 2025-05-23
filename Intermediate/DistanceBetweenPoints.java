package JavaPrograms.Intermediate;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x1 and x2: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("enter the value of y1 and y2: ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double ans = sqrt((x2 - x1)*(x2 -x1)+(y2 - y1)*(y2 - y1));
        System.out.println("distance between two point is "+ans);
    }
}
