
public class DaysToMonthsYears
{

    public static void main(String[] args)
    {
        int days = 550;
        double months = days / 30.0;
        double years = days / 365f;

        System.out.println("Days : " + days);
        System.out.println("Months : " + months);
        System.out.println("Years : " + years);
    }
}
