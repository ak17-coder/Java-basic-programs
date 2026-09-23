public class CountEven
{
    static void show(int...a)
    {
        int count = 0;
        for(int x : a)
        {
            if(x % 2 == 0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        show(1,3,4,5);

    }
}
