package JavaPrograms.Basic;

import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
