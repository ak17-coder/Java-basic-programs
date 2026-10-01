import java.util.Scanner;

class MenuDrivenProgram
{
    public static void main(String[] args)
    {

        System.out.println("You can choose the following options : ");
        System.out.println("1.Reverse");
        System.out.println("2.Sum of digits");
        System.out.println("3.Count digits");
        System.out.println("4.Palindrome");
        System.out.println("5.Armstrong");
        System.out.println("6.Even or Odd");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();

        int case1Num = num;
        int case2Num = num;
        int case3Num = num;
        int case4Num = num;
        int case5Num = num;
        int case6Num = num;

        switch(choice)
        {
            case 1:
                System.out.println("Before reversing : " + num);
                int reversed = 0;
                while(case1Num != 0)
                {
                    int digit = case1Num % 10;
                    reversed = reversed * 10 + digit;
                    case1Num /= 10;
                }
                System.out.println("After reversing : " + reversed);
                break;

            case 2:
                int sum = 0;
                while(case2Num != 0)
                {
                    int digit = case2Num % 10;
                    sum = sum + digit;
                    case2Num /= 10;
                }
                System.out.println("Sum of digits : " + sum);
                break;

            case 3:
                int digits = 0;
                while(case3Num != 0)
                {
                    case3Num /= 10;
                    digits++;
                }
                System.out.println("Count of digits : " + digits);

            case 4:
                int original = case4Num;
                int reversed1 = 0;
                while(case4Num != 0)
                {
                    int digit = case4Num % 10;
                    reversed1 = reversed1 * 10 + digit;
                    case4Num /= 10;
                }
                if(original == reversed1)
                {
                    System.out.println("Palindrome");
                }
                else
                {
                    System.out.println("not palindrome");
                }
                break;

            case 5:
                int sum1 = 0;
                int original1 = case5Num;
                while(case5Num != 0)
                {
                    int digit = case5Num % 10;
                    int cube = digit * digit * digit;
                    sum1 = sum1 + cube;
                    case5Num /= 10;
                }
                if(original1 == sum1)
                {
                    System.out.println("Armstrong Number");
                }
                else
                {
                    System.out.println("Not an armstrong");
                }
                break;

            case 6:
                if(case6Num % 2 == 0)
                {
                    System.out.println("Even");
                }
                else
                {
                    System.out.println("Odd");
                }
                break;

            default:
                System.out.println("Invalid option");


        }
    }
}