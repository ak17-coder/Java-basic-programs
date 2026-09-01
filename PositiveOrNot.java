import java.util.Scanner;

class PositiveOrNot
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Not a positive number");
        }
    }
}