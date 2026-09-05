import java.util.Scanner;

public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int original = num;
        int cube = 0;
        int sum = 0;

        while(num != 0)
        {
            int digit = num % 10;
            cube = digit * digit * digit;
            sum = sum + cube;
            num /= 10;
        }

        if(original ==  sum)
        {
            System.out.println("Armstrong Number");
        }

        else
        {
            System.out.println("Not an Armstrong Number");
        }
    }
}
