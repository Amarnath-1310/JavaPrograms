package functions.JavaPrograms;

import java.util.Scanner;

public class calculatecgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of subject: ");
        int num_sub = sc.nextInt();
        int credit,mark,tot=0;
        for (int i = 0; i < num_sub; i++) {
            System.out.println("enter the subject no :");
            int num = sc.nextInt();
            switch (num)
            {
                case 1:
                    credit = 3;
                    mark = sc.nextInt();
                    tot = credit*mark;
                    break;
                case 2:
                    credit = 3;
                    mark = sc.nextInt();
                    tot = credit*mark;
                    break;
                case 3:
                    credit = 3;
                    mark = sc.nextInt();
                    tot = credit*mark;
                    break;
                default:
                    System.out.println("invalid ");
            }
            tot = tot+tot;
        }
        System.out.println(tot);
    }
}
