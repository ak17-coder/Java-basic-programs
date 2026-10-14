class Digit4
{
    public static boolean checkDigit(char ch[])
    {
        for(char x : ch)
        {
            if(x >= '0' && x <= '9')
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        char ch[] = {'b', 'a', '0', 'a', 'n', 'a'} ;
        boolean res = checkDigit(ch);
        System.out.println(res);
    }
}