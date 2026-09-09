import java.util.Scanner;

public class MaxOfThree
{

    void max(int a, int b, int c)
    {
        if(a > b)
        {
            if(a > c)
            {
                System.out.println("Number1 is greater");
            }
            else
            {
                System.out.println("Number3 is greater");
            }
        }
        else
        {
            if(b > c)
            {
                System.out.println("Number2 is greater");
            }
            else
            {
                System.out.println("Number3 is greater");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number2 : ");
        int b = sc.nextInt();
        System.out.println("Enter number3 : ");
        int c = sc.nextInt();

        //max(a,b,c);

        MaxOfThree m = new MaxOfThree();
        m.max(a,b,c);
    }
}
