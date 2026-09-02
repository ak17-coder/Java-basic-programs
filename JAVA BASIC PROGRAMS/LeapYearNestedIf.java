import java.util.Scanner;

class LeapYearNestedIf
{

    public static void main(String[] args)
    {
        // int year = 2013;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if (year % 4 == 0)
        {
            if (year % 100 != 0)
            {
                System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
        }

        else
        {
            if (year % 400 == 0)
            {
                System.out.println("Leap year");
            }
            else
            {
                System.out.println("Not a leap year");
            }
        }
    }
}