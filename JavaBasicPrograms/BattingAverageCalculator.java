package JavaBasicProgram;

import java.util.Scanner;

public class BattingAverageCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of hits: ");
        int hit = sc.nextInt();
        System.out.println("enter the no of at-bats: ");
        int bats = sc.nextInt();
        double results = (double) hit / bats;
        System.out.println(results);
    }
}
