package JavaPrograms.Basic;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int num = sc.nextInt();
        oddeven(num);
    }

    static void oddeven(int num) {
        if(num%2==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }

}
