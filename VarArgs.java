public class VarArgs
{
    static void show(int...a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(i != a.length - 1)
            {
                System.out.print(a[i] + ",");
            }
            else
            {
                System.out.print(a[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        show(1,3,4,5);

    }
}
