class ASCIIvalue7
{

    static void ascii()
    {
        for(int i = 'A'; i <= 'Z'; i++)
        {
            System.out.print((char) i);
            System.out.println("-" + i);
        }
    }
    public static void main(String[] args)
    {
        ascii();
    }
}