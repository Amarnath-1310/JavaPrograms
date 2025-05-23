package JavaPrograms.Intermediate;

import java.util.Scanner;

public class ArmstrongFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 100; i < 1000; i++) {
            if(amstr(i)!=0){
                System.out.print(i +" ");
            }

        }
    }
    static int amstr(int num) {
        int rem,sum=0,temp= num;
        while(num>0)
        {
            rem = num%10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }
        if(temp==sum){
            return temp;
        }
        return 0;
    }

}
