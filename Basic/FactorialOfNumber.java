package JavaPrograms.Basic;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fact(5);
        fact(6);
    }

    static void fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
