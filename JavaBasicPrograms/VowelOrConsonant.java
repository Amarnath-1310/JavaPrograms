package JavaBasicProgram;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the letter: ");
        char letter = sc.next().toLowerCase().charAt(0);
        if(letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
