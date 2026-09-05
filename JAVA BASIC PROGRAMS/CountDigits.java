import java.util.Scanner;

class CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int count = 0;

        while(num != 0)
        {
            count++;
            num /= 10;
        }
        System.out.println("The total number digits are : " + count);
    }
}