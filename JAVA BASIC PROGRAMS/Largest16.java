import java.util.Scanner;

class Largest16
{
    static int max(int n1, int n2)
    {
        if(n1 > n2)
            return n1;
        else
            return n2;
    }

    static void largest(int n1, int n2, int n3)
    {
        int largest1 = max(n1, n2);
        int largest2 = max(largest1, n3);
        System.out.println("Largest number : " + largest2);
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

        largest(num1, num2, num3);
    }
}