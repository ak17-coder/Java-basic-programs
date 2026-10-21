class VowelsAndConsonentsCount1
{
    public static int[] getCountOfVowelsAndConsonent(char ch[])
    {
        int vowelCount = 0;
        int consonentCount = 0;

        for(char a : ch)
        {
            char x = ' ';
            if(a >= 'A' && a <= 'Z')
            {
                x = Character.toLowerCase(a);
            }
            else
            {
                x = a;
            }

            // if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
            if(x >= 'a' && x <= 'z')
            {

                // if(x == 'a'||x == 'e'||x == 'i'||x == 'o'||x == 'u'||x == 'A'
                // ||x == 'E'||x == 'I'||x == 'O'||x == 'U')
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
                {
                    vowelCount++;
                }
                else
                {
                    consonentCount++;
                }
            }
        }
        return new int[]{vowelCount, consonentCount};
    }
    public static void main(String[] args)
    {
        char ch[] = {'A', 'p', 'p', 'l', 'e'};
        int res[] = getCountOfVowelsAndConsonent(ch);
        for(int x : res)
        {
            System.out.print(x + " ");
        }
    }
}