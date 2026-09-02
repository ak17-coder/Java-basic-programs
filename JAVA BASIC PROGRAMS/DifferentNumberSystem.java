
import java.util.Scanner;

public class DifferentNumberSystem
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.startsWith("0b"))
        {
            System.out.println("Number system : Binary ,Radix(Base 2) " );
        }

        else if (input.startsWith("0x"))
        {
            System.out.println("Number system : Hexadecimal ,Radix(Base 16) ");
        }

        else if (input.startsWith("0"))
        {
            System.out.println("Number system : Octal ,Radix(Base 8) ");
        }

        else
        {
            System.out.println("Number system : Decimal ,Radix(Base 10) ");
        }
    }
}
