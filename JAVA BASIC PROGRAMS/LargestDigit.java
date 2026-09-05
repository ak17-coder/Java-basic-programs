import java.util.Scanner;

class LargestDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();

        // String num = sc.next();
        // char ch = num.charAt(0);
        // char largest = ch;

        // for(int i = 1; i <= num.length()-1; i++)
        // {
        //     ch = num.charAt(i);
        //     if(ch > largest)
        //     {
        //         largest = ch;
        //     }
        // }

        int largest = 0;
        while(num != 0)
        {
            int digit = num % 10;

            if(digit > largest)
            {
                largest = digit;
            }
            num /= 10;
        }
        System.out.println("The largest number in the digit is : " + largest);
    }
}