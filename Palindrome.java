public class Palindrome
{
    public static boolean checkPalindrome(char ch[])
    {
        int start = 0;
        int end = ch.length - 1;

        while(start < end)
        {
            if(ch[start] != ch[end])
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args)
    {
        char ch[] = {'m', 'a', 'd', 'a'};
        boolean res = checkPalindrome(ch);
        System.out.println(res);
    }
}
