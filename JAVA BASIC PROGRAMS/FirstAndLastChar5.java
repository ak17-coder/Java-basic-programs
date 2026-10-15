class FirstAndLastChar5
{
    public static char[] getFirstAndLastChar(char ch[])
    {
        char first =ch[0];
        char last = ch[ch.length - 1];
        return new char[]{first, last};
    }
    public static void main(String[] args)
    {
        char ch[] = {'b', 'a', '0', 'a', 'n', 'a'} ;
        char res[] = getFirstAndLastChar(ch);
        System.out.println(res[0] + " " + res[1]);
    }
}