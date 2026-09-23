public class intAndString
{
    static void show(int a, String...name)
    {
        System.out.println(a);
        for(int i = 0; i < name.length; i++)
        {
            if(i != name.length - 1)
            {
                System.out.print(name[i] + ",");
            }
            else
            {
                System.out.print(name[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        show(10, "Anirudh");

    }
}
