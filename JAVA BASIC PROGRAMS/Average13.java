import java.util.Scanner;

class Average13
{
    static int sum(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }

    static void average(int n1, int n2, int n3)
    {
        int average = sum(n1, n2 ,n3) / 3;
        System.out.println(average);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number3: ");
        int num3 = sc.nextInt();

        average(num1, num2, num3);
    }
}