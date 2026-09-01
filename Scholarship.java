
import java.util.Scanner;

class Scholarship {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = sc.nextInt();

        System.out.println("Enter income");
        int income = sc.nextInt();

        if (marks >= 85 && income <= 100000)
        {
            System.out.println("Eligible for scholarship");
        }

        else
        {
            if(marks<=85)
            {
            System.out.println("Not eligible for scholarship.Because your marks are less then 85");
            }
            else
            {
                System.out.println("Not eligible for scholarship.Because your income is higher than 1,00,000");
            }
        }
    }
}
