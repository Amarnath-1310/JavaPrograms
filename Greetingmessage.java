package functions.JavaPrograms;

import java.util.Scanner;

public class Greetingmessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to programming "+name);
    }
}
