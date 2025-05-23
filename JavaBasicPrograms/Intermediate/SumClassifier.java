package JavaPrograms.JavaBasicPrograms.Intermediate;

import java.util.Scanner;

public class SumClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,pos_odd_sum=0,pos_even_sum=0,neg_sum=0;
        while(true)
        {
            num = sc.nextInt();
            if(num>0)
            {
                if(num%2==0)
                {
                    pos_even_sum = pos_even_sum + num;
                }
                else {
                    pos_odd_sum = pos_odd_sum + num;
                }
            }
            else if (num < 0) {
                neg_sum = neg_sum + num;
            }
            else {
                break;
            }
        }
        System.out.println("sum of postive odd num: "+ pos_odd_sum);
        System.out.println("sum of postive even num: "+ pos_even_sum);
        System.out.println("sum of postive odd num: "+ neg_sum);
    }
}
