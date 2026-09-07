import java.util.Scanner;

class NestedLoops
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int res = 0;

        while (num > 0)
        {
            int digit = num % 10;
            res = res * 10 + digit;
            num /= 10;
        }

        if(original == res)
        {
            System.out.println("Palindrome");
        }

        else
        {
            System.out.println("Not Palindrome");
        }
    }

}
