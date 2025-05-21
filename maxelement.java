package functions.JavaPrograms;

import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element: ");
        int num = sc.nextInt();
        int max=0;
        while (true)
        {
            if(num!=0)
            {
                if(max<num)
                {
                    max=num;
                }
                num = sc.nextInt();
            }
            else {
                break;
            }
        }
        System.out.println(max);
    }
}
