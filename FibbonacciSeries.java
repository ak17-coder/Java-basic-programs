import java.util.Scanner;

public class FibbonacciSeries
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        if(num == 1 || num == 2)
        {
            if (num == 1)
            {
                System.out.print(a + " ");
            }

            if (num == 2)
            {
                System.out.println(a + " " + b);
            }
        }

        else
        {
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= num; i++)
            {
                int sum = a + b;
                a = b;
                b = sum;
                System.out.print(sum + " ");
            }
        }
    }
}
