package JavaBasicProgram;

import java.util.Scanner;

public class average_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num,sum=0,count=-1;
        do {
            count++;
            num = sc.nextInt();
            sum=sum+num;
        }while (num!=0);
        double avg = sum/count;
        System.out.println(avg);
    }
}
