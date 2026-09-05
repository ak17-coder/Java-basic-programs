import java.util.Scanner;

class Smallestdigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // String num = sc.next();

        // char ch = num.charAt(0);
        // char smallest = ch;

        // for(int i = 1; i <= num.length()-1; i++)
        // {
        //     ch = num.charAt(i);
        //     if(ch < smallest)
        //     {
        //         smallest = ch;
        //     }
        // }

        int smallest = 9;
        while(num != 0)
        {
            int digit = num % 10;

            if(smallest > digit)
            {
                smallest = digit;
            }
            num /= 10;
        }
        System.out.println("The smallest number in the digit is : " + smallest);
    }
}