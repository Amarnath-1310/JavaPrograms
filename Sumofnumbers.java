package functions.JavaPrograms;

import java.util.Scanner;

public class Sumofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num;
        int sum = 0;
        while(true)
        {
            num = sc.nextInt();
            sum=sum+num;
            if(num==0)
            {
                break;
            }
        }
        System.out.println(sum);
    }
}
