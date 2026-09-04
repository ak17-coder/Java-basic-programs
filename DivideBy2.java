import java.util.Scanner;

public class DivideBy2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter start : ");
        int start = sc.nextInt();

        System.out.println("Enter end : ");
        int end = sc.nextInt();

        System.out.println("Divide by 2 : ");

        for(int i = start; i >= end; i /= 2)
        {
            System.out.println(i);
        }
    }
}
