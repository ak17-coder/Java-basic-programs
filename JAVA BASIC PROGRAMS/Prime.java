import java.util.Scanner;

class prime
{
    static void prime(int n)
    {
        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
            {
                System.out.println("Not a Prime number");
                break;
            }

            else
            {
                System.out.println("Prime number");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        prime(num);
    }
}
