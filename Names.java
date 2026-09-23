class Names
{
    static void show(String...names)
    {
        for(int i = 0; i < names.length; i++)
        {
            if(i != names.length - 1)
            {
                System.out.print(names[i] + ",");
            }
            else
            {
                System.out.println(names[i]);
            }
        }
    }
    public static void main(String[] args)
    {
        show("Anirudh","Vikas","Ravi","Mahadev","Srivardhan");
    }
}