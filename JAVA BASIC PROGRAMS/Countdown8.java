import java.util.Scanner;

public class Countdown8
{
    static void count(int num)
    {
        for(int i = num; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number : ");
        int num = sc.nextInt();

        count(num);
    }
}
