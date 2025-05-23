package JavaPrograms.Intermediate;

import java.util.Scanner;

public class PrimeRangeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the prime number between 2 number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        for (int i = num1; i <= num2; i++) {
            prime(i);
        }
    }

    static void prime(int i) {
        for (int j = 2; j * j<= i; j++) {
            if(i%j==0)
            {
                return;
            }
        }
        System.out.println(i);
    }
}
