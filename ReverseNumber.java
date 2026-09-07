import java.util.Scanner;

class ReverseNumber
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        // int res = 0;
        String num = sc.next();

        System.out.println("Before Reversing : " + num);

        // while (num > 0 || num < 0)
        // {
        //     int digit = num % 10;
        //     res = res * 10 + digit;
        //     num /= 10;
        // }

        char ch = num.charAt(0);
        if(ch == '-')
        {
            System.out.print(ch);
        }

        for (int i = num.length()-1; i >= 0; i--)
        {
            ch = num.charAt(i);
            if(ch == '-')
            {
                break;
            }
            System.out.print(ch);
        }
        // System.out.println("After Reversing : " + res);
    }

}
