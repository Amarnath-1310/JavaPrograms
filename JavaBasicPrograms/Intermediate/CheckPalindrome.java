package JavaPrograms.JavaBasicPrograms.Intermediate;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        System.out.println(checkpalindrome(num));

    }

    static boolean checkpalindrome(int num) {
        int temp = num;
        int rem,rev=0;
        while (num>0)
        {
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        if(temp == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
