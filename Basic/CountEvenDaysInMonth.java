package JavaPrograms.Basic;

import java.util.Scanner;

public class CountEvenDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("August month ");
        int count = 0;
        for (int i = 1; i <= 31; i++) {
            if(i%2==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
