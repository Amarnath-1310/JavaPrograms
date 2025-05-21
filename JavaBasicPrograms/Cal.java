package JavaBasicProgram;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 and num2: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("enter the operation : ");
        char op = sc.next().charAt(0);
        int ans;
        if (op=='+') {
            ans=num1+num2;
            System.out.println(ans);
        }
        else if(op=='-')
        {
            ans=num1-num2;
            System.out.println(ans);
        }
        else if(op=='*')
        {
            ans=num1*num2;
            System.out.println(ans);
        }
        else {
            if(num2!=0) {
                ans=num1/num2;
                System.out.println(ans);
            }
        }
    }
}
