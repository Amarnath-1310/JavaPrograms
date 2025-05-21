package functions.JavaPrograms;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base and power: ");
        int base = sc.nextInt();
        int pow = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= pow; i++) {
            ans=ans*base;
        }
        System.out.println(ans);
    }
}
