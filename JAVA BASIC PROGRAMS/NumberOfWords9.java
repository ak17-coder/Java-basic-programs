class NumberOfWords9
{
    public static int getNumberOfWords(char ch[])
    {
        int count = 0;
        if(ch[0] == ' ')
            count = 0;
        else
            count = 1;

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[ch.length - 1] == ' ')
            {
                continue;
            }
            if(ch[i] == ' ')
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        char ch[] = {'d', '1', ' ', 'a', 'w', 'r'};
        int res = getNumberOfWords(ch);
        System.out.println(res);
    }
}
