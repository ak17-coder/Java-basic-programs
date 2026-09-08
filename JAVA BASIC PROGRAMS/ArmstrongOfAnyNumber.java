
import java.util.Scanner;

public class ArmstrongOfAnyNumber
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;
        int sum = 0;

        while (temp != 0)
        {
            digits++;
            temp /= 10;
        }

        while (num != 0)
        {
            int digit = num % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++)
            {
                power = power * digit;
            }
            sum = sum + power;
            num /= 10;
        }

        if (sum == original)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not an armstrong number");
        }
    }
}
