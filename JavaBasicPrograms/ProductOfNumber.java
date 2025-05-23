package JavaBasicProgram;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = productnum(num1, num2);
        System.out.println(result);
    }

    static int productnum(int num1, int num2) {
        return num1 * num2;
    }
}
