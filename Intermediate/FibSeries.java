package JavaPrograms.Intermediate;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element upto: ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+ " " + num2);
        for(int i = 0;i<n-2;i++)
        {
            int temp=num1+num2;
            System.out.print(" "+temp);
            num1 = num2;
            num2 = temp;
        }
    }
}
