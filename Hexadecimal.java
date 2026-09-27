import java.util.Scanner;

public class Hexadecimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next(); // 127 is a word.

        boolean hexadecimal = true; // assume that number is octal.

        for(int i = 0; i <= num.length() - 1; i++)
        {

            char ch = num.charAt(i);
            if((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F'))
            {
                hexadecimal = false;
            }

            else
            {
                hexadecimal = true;
            }

            if(hexadecimal)
            {
                System.out.println(ch + " --> Hexadecimal and Radix = 16");
            }

            else
            {
                System.out.println(ch + " --> Not Hexadecimal");
            }
        }
    }
}
