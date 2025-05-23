package JavaPrograms.JavaBasicPrograms.Intermediate;

import static java.lang.Math.sqrt;

public class MathVibes {
    public static void main(String[] args) {
        // area formula
        areaofcircle(2);
        areaoftriangel(2,3);
        areaofrectangle(2,3);
        areaofisolated(2,3);
        areaofparallegram(2,3);
        areaofrhombus(2,4);
        areaofequalatertriange(10);
        //perimeter
        perimeterofcircle(2);
        perimeterofequilateraltriangle(2);
        perimeterofparallelogram(2,3);
        perimeterofrectangle(2,3);
        perimeterofsquare(4);
        perimeterofrhombus(5);
        //volume
        volumeofcone(2,4);
        volumeofprism(2,6);
        volumeofcylinder(2,5);
        volumeofsphere(4);
        volumeofpyramid(2,4);
        //surface area
        surfaceareaofcylinder(2,4);
        surfaceareaofcone(5);
    }

    static void surfaceareaofcone(int side) {
        int ans = 6*side*side;
        System.out.println(ans);
    }

    static void surfaceareaofcylinder(int r, int h) {
        double ans = 2*3.14*r*h;
        System.out.println(ans);
    }

    static void volumeofpyramid(int area, int height) {
        double ans = 0.333*area*height;
        System.out.println(ans);
    }

    static void volumeofsphere(int r) {
        double ans = (4/3)*3.14*r*r*r;
        System.out.println(ans);
    }

    static void volumeofcylinder(int r, int h) {
        double ans = 3.14*r*r*h;
        System.out.println(ans);
    }

    static void volumeofprism(int area, int height) {
        int ans = area * height;
        System.out.println(ans);
    }

    static void volumeofcone(int r, int h) {
        double ans = 0.333*3.14*r*r*h;
        System.out.println(ans);
    }

    static void perimeterofrhombus(int side) {
        int ans = 4*side;
        System.out.println(ans);
    }

    static void perimeterofsquare(int side) {
        int ans = 4*side;
        System.out.println(ans);
    }

    static void perimeterofrectangle(int length, int width) {
        int ans = 2*(length+width);
        System.out.println(ans);
    }

    static void perimeterofparallelogram(int base, int side) {
        int ans = 2 * (base + side);
        System.out.println(ans);
    }

    static void perimeterofequilateraltriangle(int side) {
        int ans = 3*side;
        System.out.println(ans);
    }

    static void perimeterofcircle(int r) {
        double ans = 2*3.14*r;
        System.out.println(ans);
    }

    static void areaofequalatertriange(int side) {
        double ans = (sqrt(3)/4)*side*side;
        System.out.println(ans);
    }

    static void areaofrhombus(int d1, int d2) {
        double ans = (d1 * d2)/2;
        System.out.println(ans);
    }

    static void areaofparallegram(int base, int height) {
        int ans = base * height;
        System.out.println(ans);
    }

    static void areaofisolated(int base, int height) {
        double ans = (base * height)/2;
        System.out.println(ans);
    }

    static void areaofrectangle(int width, int length) {
        int ans= width*length;
        System.out.println(ans);
    }

    static void areaoftriangel(int base, int height) {
        double ans = 0.5*base*height;
         System.out.println(ans);
    }

    static void areaofcircle(int r) {
        double ans = 3.14*r*r;
        System.out.println(ans);
    }
}
