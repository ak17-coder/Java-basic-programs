import java.util.Scanner;

public class Decimal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next(); // 127 is a word.

        boolean decimal = true;

        for(int i = 0; i <= num.length() - 1; i++)
        {

            char ch = num.charAt(i);
            if((ch < '0' || ch > '9'))
            {
                decimal = false;
            }`

            else
            {
                decimal = true;
            }

            if(decimal)
            {
                System.out.println(ch + " --> Decimal and Radix = 10");
            }

            else
            {
                System.out.println(ch + " --> Not Decimal");
            }
        }
    }
}
