package JavaPrograms.JavaBasicPrograms.Basic;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the list price: ");
        int listprice = sc.nextInt();
        System.out.println("enter the selling price: ");
        int sellingprice = sc.nextInt();
        double discount  = listprice - sellingprice;
        System.out.println("discount of the product ");
        System.out.println(discount);
    }
}
