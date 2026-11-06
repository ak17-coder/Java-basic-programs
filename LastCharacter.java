public class LastCharacter
{
    public static char getLastCharacter(char ch[])
    {
        char max = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] >= 'a' && ch[i] <= 'z')
            if(ch[i] > max)
                max = ch[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        char ch[] = {'1', 'p', 'r', 'o', 'g', 'r', 'a', 'm', 'z'};
        char res = getLastCharacter(ch);
        System.out.println(res);
    }
}
