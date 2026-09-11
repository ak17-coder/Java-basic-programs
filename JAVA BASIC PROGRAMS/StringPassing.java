public class StringPassing
{
    static void welcome(String name1)
    {
        name1 = "Kulkarni";
        System.out.println("Welcome Mr. " + name1);
    }
    public static void main(String[] args)
    {
        String name = "Anirudh";
        welcome(name);
    }
}
