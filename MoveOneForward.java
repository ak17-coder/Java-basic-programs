class MoveOneForward
{
    public static char[] getMoveOnrForward(char ch[])
    {
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            {
                if(ch[i] == 'z')
                {
                    ch[i] = 'a';
                    continue;
                }
                int a = (int)ch[i];
                a = a + 1;
                ch[i] = (char)a;
            }
        }
        return ch;
    }
    public static void main(String[] args)
    {
        char ch[] = {'c','a','t','y'} ;
        char res[] = getMoveOnrForward(ch);
        for(char c : res)
            System.out.print(c + " ");
    }
}