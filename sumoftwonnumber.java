package functions.JavaPrograms;

import java.util.Scanner;

public class sumoftwonnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        addofnumber(num1,num2);
    }

    static void addofnumber(int num1, int num2) {
        System.out.println(num1+num2);
    }
}
