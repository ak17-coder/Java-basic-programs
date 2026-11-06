public class NotPresentInArray
{
    public static char[] getPresentInAnArray(char ch1[], char ch2[])
    {
        char res[] = new char[ch1.length];
        int j = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            if(ch1[i] != ch2[i])
            {
                res[j] = ch1[i];
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        char ch1[] = {'c', 'a', 'r', 'd'};
        char ch2[] = {'c', 'a', 'j', 'd'};

        char count[] = getPresentInAnArray(ch1, ch2);
        for(char c : count)
            System.out.print(c + " ");
    }
}
