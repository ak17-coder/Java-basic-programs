public class CountHotterDays
{
    public static int getCountOfHotterDays(int arr[])
    {
        if(arr == null || arr.length == 0)
            return -1;

        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if( i!= arr.length - 1)
            {
                if(arr[i + 1] > arr[i])
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {30, 32, 31, 35, 36, 34, 37};

        int res = getCountOfHotterDays(arr);
        System.out.println(res);
    }
}
