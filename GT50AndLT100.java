public class GT50AndLT100
{
    public static int[] getCount(int arr[])
    {
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int count = 0;
        for(int i = 0;i < arr.length; i++)
        {
            if(arr[i] > 50 && arr[i] < 100)
            {
                count++;
            }
        }

        int arr1[] = new int[count];
        int index = 0;

        for(int i = 0;i < arr.length; i++)
        {
            if(arr[i] > 50 && arr[i] < 100)
            {
                arr1[index] = arr[i];
                index++;
            }
        }

        return arr1;

    }
    public static void main(String[] args)
    {
        int arr[] = {-45, 67, 100, 52, 99, 120, 50, 0};

        int res[] = getCount(arr);

        for(int x : res)
        {
            System.out.print(x + " ");
        }
    }
}
