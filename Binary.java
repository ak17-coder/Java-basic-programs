import java.util.Scanner;

public class Binary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next(); // 127 is a word.

        boolean binary = false; // assume that number is octal.

        for(int i = 0; i <= num.length() - 1; i++)
        {

            char ch = num.charAt(i);
            if(ch < '0' || ch > '1')
            {
                binary = false;
            }

            else
            {
                binary = true;
            }

            if(binary)
            {
                System.out.println(ch + " --> Binary and Radix = 2");
            }

            else
            {
                System.out.println(ch + " --> Not binary");
            }
        }

    }
}
