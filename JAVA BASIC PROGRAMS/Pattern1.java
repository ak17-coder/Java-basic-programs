import java.util.Scanner;

class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        for (int i = num; i >= 1; i--)
        {
            for (int k = 1; k <= num - i; k++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= i + (i - 1); j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
