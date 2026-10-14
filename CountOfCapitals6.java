class CountOfCapitals6
{
    public static int getCountOfCapitals(char ch[])
    {
        int count = 0;
        for(int x = 0; x < ch.length; x++)
        {
            if(Character.isUpperCase(ch[x]))
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        char ch[] = {'b', 'A', 'n', 'A', 'N', 'a'} ;
        int res = getCountOfCapitals(ch);
        System.out.println(res);
    }
}