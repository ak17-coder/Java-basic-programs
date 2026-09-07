import java.util.Scanner;

class DisplayDigits
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // String res = sc.next();
        int reversed = 0;

        // 1)Using while loop
        // This loop for reversing the number
        // while(num > 0)
        // {
        //     int digit = num % 10;
        //     reversed = reversed * 10 + digit;
        //     num /= 10;
        // }

        // To print the digits
        // while (reversed > 0)
        // {
        //     int digit = reversed % 10;
        //     System.out.println(digit);
        //     reversed /= 10;
        // }

        // 2) Using number as a String
        // for (int i = 0; i <= res.length()-1; i++)
        // {
        //     char ch = res.charAt(i);
        //     System.out.println(ch);
        // }

        // 3)Using for loop
        // To reverse the number
        for(int i = num; i > 0; i /= 10)
        {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
        }

        // To print the number
        for (int i = reversed; i > 0; i /= 10)
        {
            int digit = i % 10;
            System.out.println(digit);
        }
    }

}
