public class Sum
{
    static int sum = 0;
    static void s(int n)
    {
        if(n == 0)
        {
            return;
        }
        sum = sum + n;
        s(n - 1);


    }
    public static void main(String[] args)
    {
        s(5);
        System.out.println(sum);

    }
}
