import java.util.Scanner;

public class Patterns1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= num; j++)
        //     {
        //         System.out.print(i + j + " ");
        //     }
        //     System.out.println();
        // }

        // int cnt = 1;
        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= num; j++)
        //     {
        //         System.out.format("%02d ",cnt);
        //         cnt++;
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print(j + " ");
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int cnt = 1;
        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= i; j++)
        //     {
        //         System.out.print(cnt + " ");
        //         cnt++;
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= num - i + 1; j++)
        //     {
        //         // System.out.print(j + " ");
        //         System.out.print("*" + " ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= num; i++)
        // {
        //     for(int j = 1; j <= num; j++)
        //     {
        //         if (j >= i)
        //         {
        //             System.out.print("*" + " ");
        //         }
        //         else
        //         {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        for (int i = num; i >= 1; i--)
        {
            for(int j = 1; j <= num; j++)
            {
                if (j < i)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" " + "*");
                }
            }
            System.out.println();
        }
    }
}
