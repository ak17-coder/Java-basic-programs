class CountOfRGY
{
    public static int[] getCount(char ch[])
    {
        int RCount = 0;
        int GCount = 0;
        int YCount = 0;
        for(char x : ch)
        {
            if(x == 'R')
                RCount++;
            else if(x == 'G')
                GCount++;
            else if(x == 'Y')
                YCount++;
        }
        return new int[]{RCount, GCount, YCount};
    }
    public static void main(String[] args)
    {
        char ch[] = {'R','G','G','Y','R','G'} ;
        int count[] = getCount(ch);
        System.out.println(count[0] + " " + count[1] + " " + count[2]);
    }
}