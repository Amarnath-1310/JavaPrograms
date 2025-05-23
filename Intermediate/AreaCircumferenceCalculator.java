package JavaPrograms.Intermediate;

import java.util.Scanner;

public class AreaCircumferenceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int rad = sc.nextInt();
        areacircum(rad);
    }

    static void areacircum(int rad) {
        double area = 3.14 * rad * rad;
        double circum = 2 * 3.14 *rad;
        System.out.println("area of circle "+area+"\ncircumfance of circle "+circum);
    }
}
