public class CountKey
{
    static void show(int key, int...a)
    {
        int count = 0;
        for(int x : a)
        {
            if(x == key)
            {
                count++;
            }
        }
        System.out.println("Numbers of even numbers : " + count);
    }
    public static void main(String[] args)
    {
        show(20,20,10,20,30,40,20);

    }
}
