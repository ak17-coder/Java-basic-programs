import java.util.Scanner;

public class Octal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next(); // 127 is a word.

        boolean octal = false; // assume that number is octal.

        for(int i = 0; i <= num.length() - 1; i++)
        {
            char ch = num.charAt(i);
            if(ch >= '0' && ch <= '7')
            {
                System.out.println("Octal");
                octal = true;
                break;
            }

            if(!octal)
            {
                System.out.println("Not octal");
                break;
            }


        }
    }
}
