package JavaPrograms.Basic;

import java.util.Scanner;

public class INRtoUSDConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double inr = scan.nextInt();
        double usd = 0.0118;
        usd = usd * inr;
        System.out.println(usd);
    }
}
