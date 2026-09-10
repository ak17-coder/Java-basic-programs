import java.util.Scanner;

public class SundayOrSaturday
{
    public static void main(String[] args)
    {

        // String day = "Sunday";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : ");
        String day = sc.nextLine();

        if(day.equals("Sunday") || day.equals("Saturday"))
        {
            System.out.println("Holiday");
        }
        else
        {
            System.out.println("Working day");
        }
    }
}