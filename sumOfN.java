public class sumOfN
{
    int findSum(int []arr)
    {
        int sum = 0;
        for(int x : arr)
        {
            sum = sum + x;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        sumOfN n = new sumOfN();
        int []arr = {1,3,5,4};
        System.out.println(n.findSum(arr));
    }
}
