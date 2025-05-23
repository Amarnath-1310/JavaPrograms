package JavaBasicProgram;

import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value: ");
        int num = in.nextInt();
        if(num%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
