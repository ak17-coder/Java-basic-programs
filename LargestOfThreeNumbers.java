import java.util.Scanner;

public class LargestOfThreeNumbers
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int number1 = sc.nextInt();

        System.out.println("Enter number2 : ");
        int number2 = sc.nextInt();

        System.out.println("Enter number3 : ");
        int number3 = sc.nextInt();

        if (number1 > number2)
        {
            if(number1 > number3)
            {
            System.out.println("Number1 is greater");
            }
            else
            {
                System.out.println("Number3 is greater");
            }
        }
        else
        {
            if(number2 > number3)
            {
                System.out.println("Number2 is greater");
            }
            else
            {
                System.out.println("Number3 is greater");
            }
        }
    }
}
