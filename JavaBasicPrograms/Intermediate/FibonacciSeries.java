package JavaPrograms.JavaBasicPrograms.Intermediate;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num1 = 0;
        int num2 = 1;
        int i = 1;
        while(i<=n) {
            int temp = num1 + num2;
            System.out.print(num1 + " ");
            num1 = num2;
            num2 =temp;
            i++;
        }
    }
}
