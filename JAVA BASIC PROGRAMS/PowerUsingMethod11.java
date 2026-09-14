import java.util.Scanner;

class PowerUsingMethod11
{

    static void calculatePower(int base, int exponent)
    {
        int res = 1;
        for(int i = 1; i <= exponent; i++)
        {
            res = res * base;
        }
        System.out.println("Result : " + res);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int base = sc.nextInt();
        System.out.println("Enter exponent : ");
        int exponent = sc.nextInt();

        calculatePower(base, exponent);
    }
}