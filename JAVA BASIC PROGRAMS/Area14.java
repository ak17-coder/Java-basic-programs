import java.util.Scanner;

class Area14
{
    static int square(int n1)
    {
        return n1 * n1;
    }

    static void area(int n1)
    {
        int area = square(n1);
        System.out.println(area);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks1: ");
        int num1 = sc.nextInt();

        area(num1);
    }
}