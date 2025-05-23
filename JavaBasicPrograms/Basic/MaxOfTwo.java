package JavaPrograms.JavaBasicPrograms.Basic;

import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1<num2)
        {
            System.out.println(num2 + " is big");
        }
        else {
            System.out.println(num1 + " is big");
        }
    }
}
