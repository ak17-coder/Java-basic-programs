import java.util.Scanner;

class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while(num > 0)
        {
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum = sum + cube;
            num /= 10;
        }

        if(sum == original)
        {
            System.out.println("Armstrong number");
        }

        else
        {
            System.out.println("Not an armstrong number");
        }

    }
}

