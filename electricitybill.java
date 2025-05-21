package functions.JavaPrograms;

public class electricitybill {
    public static void main(String[] args) {
        double ans =bill(500);
        System.out.println(ans);
    }

    static double bill(int unit) {
        double total_amount=0;
        if(unit<=0)
        {
            return 0;
        }
        else {
            if(unit>0 && unit<=100)
            {
                total_amount=1.50*unit+50;
            }
            else if(unit>100 && unit<=200)
            {
                total_amount=2.00*unit+100;
            }
            else {
                total_amount=3.50*unit+150;
            }
        }
        return total_amount;
    }
}
