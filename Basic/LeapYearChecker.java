package JavaPrograms.Basic;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}