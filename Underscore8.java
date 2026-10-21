class Underscore8
{

    public static void getUnderScore(char ch[])
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == ' ')
            {
                ch[i] = '_';
            }
        }
    }

    public static void main(String[] args)
    {
        char ch[] = {'a', ' ', 'd', '1', ' ', 'a', 'w', 'r'};
        System.out.println("Before replacing");
        for(char x : ch)
        {
            System.out.print(x + " ");
        }

        System.out.println();

        getUnderScore(ch);
        System.out.println("After replacing with _");
        for(char x : ch)
        {
            System.out.print(x + " ");
        }
    }
}
