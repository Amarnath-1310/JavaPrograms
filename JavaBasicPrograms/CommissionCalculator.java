package JavaBasicProgram;

import java.util.Scanner;

public class CommissionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the selling rate :");
        int sellingrate = sc.nextInt();
        System.out.println("enter the commission rate :");
        int c_rate = sc.nextInt();
        float ans = sellingrate * c_rate/100;
        System.out.println(ans);
    }
}
