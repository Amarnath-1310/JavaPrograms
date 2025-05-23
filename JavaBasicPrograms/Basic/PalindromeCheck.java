package JavaPrograms.JavaBasicPrograms.Basic;

import java.util.Scanner;

public class PalindromeCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean ans = checkpoint(name);
        System.out.println(ans);
    }

    static boolean checkpoint(String name)
    {
        int i=0;
        int j=name.length()-1;
        while(i<=j)
        {
            if(name.charAt(i)==name.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }

        }
        return true;
    }
}
