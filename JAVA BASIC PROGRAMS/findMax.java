public class findMax
{
    int findMax(int []arr)
    {
        int max = 0;
        for(int x : arr)
        {
            if(x > max)
            {
                max = x;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        findMax f = new findMax();
        int []arr = {10, 20, 30, 40};
        System.out.println(f.findMax(arr));
    }
}
