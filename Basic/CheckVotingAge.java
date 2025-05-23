package JavaPrograms.Basic;

import java.util.Scanner;

public class CheckVotingAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int age = sc.nextInt();
        checkforvote(age);
    }

    static void checkforvote(int age) {
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else {
            System.out.println("not eligible for vote");
        }
    }
}
