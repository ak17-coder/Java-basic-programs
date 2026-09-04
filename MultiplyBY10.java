import java.util.Scanner;

public class MultiplyBY10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start : ");
        int start = sc.nextInt();

        System.out.println("Enter end : ");
        int end = sc.nextInt();

        System.out.println("Multiply by 10 : ");

        for(int i = start; i <= end; i *= 10)
        {
            System.out.println(i);
        }
    }
}
