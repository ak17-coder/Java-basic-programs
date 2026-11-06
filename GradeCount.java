public class GradeCount
{
    public static int getGradeCount(char ch[], int key)
    {
        int count = 0;
        for(char c : ch)
        {
            if(c == key)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        char ch[] = {'A', 'B', 'A', 'a'};
        int res = getGradeCount(ch, 'A');
        System.out.println(res);
    }
}
