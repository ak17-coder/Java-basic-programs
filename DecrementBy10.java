import java.util.Scanner;

public class DecrementBy10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start : ");
        int start = sc.nextInt();

        System.out.println("Enter end : ");
        int end = sc.nextInt();

        System.out.println("Decrement by 10 : ");

        for(int i = start; i >= end; i = i - 10)
        {
            System.out.println(i);
        }
    }
}
