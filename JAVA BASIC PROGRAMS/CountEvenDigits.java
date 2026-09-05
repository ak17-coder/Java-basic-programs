
import java.util.Scanner;

class CountEvenDigits
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        // String num = sc.next();
        int num = sc.nextInt();

        int count = 0;

        // for(int i = 0; i <= num.length()-1; i++)
        // {
        //     char ch = num.charAt(i);
        //     if(ch % 2 == 0)
        //     {
        //         count += 1;
        //     }
        // }
        while (num != 0)
        {
            int digit = num % 10;
            if (digit % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        System.out.println("The total number of even digits are : " + count);
    }
}