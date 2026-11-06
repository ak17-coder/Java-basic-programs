public class SumOfDigits
{
    public static int getGradeCount(char ch[], int key)
    {
        int sum = 0;
        for(char c : ch)
        {
            if(c >= '0' && c <= '9')
            {
                // int a = (int)c - '0';
                sum = sum + c - '0';
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {
        char ch[] = {'A', '8', '1', '2'};
        int res = getGradeCount(ch, 'A');
        System.out.println(res);
    }
}
