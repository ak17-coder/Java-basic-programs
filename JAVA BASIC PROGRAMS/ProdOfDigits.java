
import java.util.Scanner;

class ProdOfDigits
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt(); //527

        int prod = 1;

        // while(num != 0)
        // {
        //     int digit = num % 10; // 7.
        //     sum = sum + digit; //7
        //     num /= 10; //52
        // }

        // Using for loop.
        for(num = num; num != 0; num /= 10)
        {
            int digit = num % 10;
            prod = prod * digit;
        }

        System.out.println("Product of digits : " + prod);

    }
}
