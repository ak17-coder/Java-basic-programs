class Initials10
{
    public static char[] getInitials(char ch[])
    {
        char c[] = new char[ch.length];
        int j = 0;
        c[j] = Character.toUpperCase(ch[0]);
        j++;
        for(int i = 0; i < ch.length; i++)
        {
            
            if(ch[i] == ' ')
            {
                c[j] = Character.toUpperCase(ch[i + 1]);
                j++;
            }
        }
        return c;
    }

    public static void main(String[] args)
    {
        char ch[] = {'d', '1', ' ', 'a', 'w', 'r'};
        char res[] = getInitials(ch);
        for(int i = 0; i < res.length; i++)
        {
            System.out.println(res[i] + " ");
        }
    }
}
