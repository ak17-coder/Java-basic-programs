import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;

        // for (int i = 1; i <= num; i++)
        // {
        //     System.out.print(a + " ");
        //     sum = a + b;
        //     a = b;
        //     b = sum;

        // }

        int i = 1;
        do
        {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
            i++;
        }while(i <= num);

    }
}

