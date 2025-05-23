package JavaPrograms.Basic;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of P,N and R : ");
        int P = scan.nextInt();
        int N = scan.nextInt();
        int R = scan.nextInt();
        int SI = P * R * N;
        System.out.print("Simple interest : "+SI);
    }
}
