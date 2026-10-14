class CountOfGivenKey2
{
    public static int getCountOfKey(char ch[], char key)
    {
        int count = 0;
        for(int x : ch)
        {
            if(x == key)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        char ch[] = {'b', 'A', 'n', 'a', 'n', 'a'} ;
        int res = getCountOfKey(ch, 'a');
        System.out.println(res);
    }
}