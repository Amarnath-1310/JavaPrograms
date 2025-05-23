package JavaPrograms.JavaBasicPrograms.Intermediate;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your mark:");
        int mark = sc.nextInt();
        grade(mark);
    }

    static void grade(int mark) {
        if(mark>90 && mark<=100)
        {
            System.out.println("AA");
        }
        else if(mark>80 && mark<=90)
        {
            System.out.println("BB");
        }
        else if(mark>70 && mark<=80)
        {
            System.out.println("CC");
        }
        else if(mark>60 && mark<=70)
        {
            System.out.println("BC");
        }
        else if(mark>50 && mark<=60)
        {
            System.out.println("BD");
        }
        else if(mark>40 && mark<=50)
        {
            System.out.println("DD");
        }
        else {
            System.out.println("Fail");
        }
    }
}
