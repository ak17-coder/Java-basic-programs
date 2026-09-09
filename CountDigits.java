import java.util.Scanner;

public class CountDigits
{
    void countDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num /= 10;
            count++;
        }
        System.out.println("Count is : " + count);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        // countDigits(num);
        CountDigits cd = new CountDigits();
        cd.countDigits(num);
    }
}
