package functions.JavaPrograms;

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value:");
        int n = sc.nextInt();
        fact(n);
    }

    static void fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        System.out.println(f);
    }
}
