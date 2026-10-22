public class Factorial
{
    static int fact(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        return n * fact(n - 1);

    }
    public static void main(String[] args)
    {
        int f = fact(1);
        System.out.println(f);
    }
}
