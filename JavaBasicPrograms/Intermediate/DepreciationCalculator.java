package JavaPrograms.JavaBasicPrograms.Intermediate;

import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost: ");
        int cost = sc.nextInt();
        System.out.println("enter the scrap value: ");
        int scrap = sc.nextInt();
        System.out.println("enter the useful time(years): ");
        int year = sc.nextInt();
        float ans = (cost-scrap)/year;
        System.out.println(ans);
    }
}
