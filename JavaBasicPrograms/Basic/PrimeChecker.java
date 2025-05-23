package JavaPrograms.JavaBasicPrograms.Basic;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        primenot(num);

    }

    static void primenot(int num) {
        for (int i = 2; i*i <= num; i++) {
            if(num%i==0) {
                System.out.println("not prime");
                return;
            }

        }
        System.out.println("prime ");
    }
}
