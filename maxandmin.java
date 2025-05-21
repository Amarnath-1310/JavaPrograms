package functions.JavaPrograms;

public class maxandmin {
    public static void main(String[] args) {
        maxofelement(1,0,0);
        minofelement(1,0,0);
    }

    static void minofelement(int a, int b, int c) {
        int min = a;
        if(b<min)
        {
            min = b;
        }
        if(c<min)
        {
            min = c;
        }
        System.out.println("minimum element is "+min);
    }

    static void maxofelement(int a, int b, int c) {
        int max = a;
        if(b>max)
        {
            max = b;
        }
        if(c>max)
        {
            max = c;
        }
        System.out.println("maximum element is "+max);
    }

}
