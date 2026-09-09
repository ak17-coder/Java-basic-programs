import java.util.Scanner;

public class Palindrome
{
    void palindrome(int num)
    {
        int reversed = 0;
        int original = num;
        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(original == reversed)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // countDigits(num);
        Palindrome p = new Palindrome();
        p.palindrome(num);
    }
}
