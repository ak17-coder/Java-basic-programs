public class FullName
{
    public static char[] getFullName(char ch1[], char ch2[])
    {
        char res[] = new char[ch1.length + ch2.length + 1];
        int k = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            res[k] = ch1[i];
            k++;
        }

        res[k] = ' ';
        k++;

        for(int i = 0; i < ch2.length; i++)
        {
            res[k] = ch2[i];
            k++;
        }
        return res;
    }
    public static void main(String[] args)
    {
        char ch1[] = {'r', 'a', 'm'};
        char ch2[] = {'k','u','m','a','r'};

        char name[] = getFullName(ch1, ch2);
        for(char c : name)
            System.out.print(c + " ");
    }
}
