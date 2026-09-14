import java.util.Scanner;

class MaxOfThree
{
    static int square(int n)
    {
        return n * n;
    }

    static void cube(int n)
    {
        int cube = square(n) * n;
        System.out.println(cube);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        cube(num);
    }
}