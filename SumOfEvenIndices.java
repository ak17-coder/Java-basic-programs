public class SumOfEvenIndices
{
    public static int getSumOfEvenIndices(int arr[])
    {
        if(arr == null || arr.length == 0)
            return -1;

        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 == 0)
            {
                sum += arr[i];
            }
        }

        return sum;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 3, 20, 7, 30};

        int res = getSumOfEvenIndices(arr);
        System.out.println(res);
    }
}
