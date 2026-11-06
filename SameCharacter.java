public class SameCharacter
{
    public static int getSameCharacterCount(char ch1[], char ch2[])
    {
        int count = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            if(ch1[i] == ch2[i])
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        char ch1[] = {'c', 'a', 'r', 'd'};
        char ch2[] = {'c', 'a', 'j', 'd'};

        int count = getSameCharacterCount(ch1, ch2);
        System.out.println(count);
    }
}
