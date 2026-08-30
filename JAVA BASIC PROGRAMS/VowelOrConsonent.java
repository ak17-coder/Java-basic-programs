class VowelOrConsonent
{
    public static void main(String[] args)
    {
        char char1 = 'B';
        if((char1 == 'A') || (char1 == 'E') || (char1 == 'I') ||
        (char1 == 'O') || (char1 == 'U'))
        {
            System.out.println(char1 + " is a Vowel");
        }
        else
        {
            System.out.println(char1 + " is Consonent");
        }
    }
}