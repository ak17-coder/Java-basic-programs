public class VowelsRemoved
{
    public static char[] getVowelsRemoved(char ch[])
    {
        char res[] = new char[ch.length];
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u')
                res[i] = ch[i];
        }
        return res;
    }
    public static void main(String[] args)
    {
        char ch[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
        char res[] = getVowelsRemoved(ch);
        for(char c : res)
            System.out.print(c + " ");
    }
}
