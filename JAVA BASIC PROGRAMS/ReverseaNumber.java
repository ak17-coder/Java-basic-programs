
import java.util.Scanner;

class ReverseaNumber
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt(); //527

        int reverse = 0;

        // while(num != 0)
        // {
        //     int digit = num % 10; // 7.
        //     sum = sum + digit; //7
        //     num /= 10; //52
        // }

        System.out.println("Before reversing : " + num);

        // Using for loop.
        for(num = num; num != 0; num /= 10)
        {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("After reversing : " + reverse);

    }
}
