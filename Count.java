public class Count
{
    static int cnt = 0;
    static void count(int n)
    {
        if(n == 0)
        {
            return;
        }
        count(n - 1);
        cnt++;
    }
    public static void main(String[] args)
    {
        count(5);
        System.out.println(cnt);
    }
}
