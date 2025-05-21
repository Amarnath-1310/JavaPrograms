package functions.JavaPrograms;

import java.util.Scanner;

public class recusive_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value: ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println(result);
    }

    static int fact(int num) {

        if(num==1||num == 0)
        {
            return 1;
        }
        return num * fact(num-1);
    }
}
