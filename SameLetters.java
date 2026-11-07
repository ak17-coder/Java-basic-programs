public class SameLetters
{
    public static boolean checkGetSame(char ch1[], char ch2[])
    {
        int count = 0;
        if(ch1.length != ch2.length)
            return false;
        for(int i = 0; i < ch1.length; i++)
        {
            for(int j = 0; j < ch2.length; j++)
            {
                if(ch1[i] == ch2[j])
                    count++;
            }
        }

        if(count == ch1.length)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        char ch1[] = {'s','i','l','e','n','t'};
        char ch2[] = {'l','i','s','t','e','n'};

        boolean res = checkGetSame(ch1, ch2);
        System.out.println(res);
    }
}
