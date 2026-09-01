import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int a = sc.nextInt();

        System.out.println("Enter number2 : ");
        int b = sc.nextInt();

        int c;

        System.out.println("Enter operator : ");
        char ch = sc.next().charAt(0);

        switch(ch)
        {
            case '+':
                c = a + b;
                System.out.println(c);
                break;

            case '-':
                c = a - b;
                System.out.println(c);
                break;

            case '*':
                c = a * b;
                System.out.println(c);
                break;

            case '/':
                c = a / b;
                System.out.println(c);
                break;

            case '%':
                c = a % b;
                System.out.println(c);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
