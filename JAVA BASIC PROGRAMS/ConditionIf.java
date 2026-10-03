import java.util.Scanner;

class ConditionIf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age <= 0)
        {
            System.out.println("Enter valid age");
        }

        if(age >= 18)
        {
            System.out.println("Eligible to vote ");
        }
        else
        {
            System.out.println("Not eligible to vote");
        }
    }
}