public class Revserse
{
    static int reverse = 0;

    public static void reverseNumber(int n)
    {
        if(n == 0)
        {
            return;
        }

        reverse = reverse * 10 + (n % 10);

        reverseNumber(n / 10);
    }

    public static void main(String[] args)
    {
        reverseNumber(629);
        System.out.println(reverse);
    }
}
