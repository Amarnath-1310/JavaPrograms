package JavaBasicProgram;

import java.util.Scanner;

public class averageofnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int sum=0,count=0;
        double avg;
        while(true)
        {
            int num=sc.nextInt();
            count++;
            sum = sum+num;
            avg = sum/count;
            if(num==0)
            {
                break;
            }
        }
        System.out.println(avg);
    }
}
