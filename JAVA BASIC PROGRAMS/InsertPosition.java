public class InsertPosition
{
    // public static int getIndex(int arr[], int target)
    // {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     int index = 0;
    //     while(start <= end)
    //     {
    //         int mid = (start + end) / 2;
    //         if(arr[mid] > target)
    //         {
    //             end = mid - 1;
    //         }
    //         else if(arr[mid] < target)
    //         {
    //             start = mid + 1;
    //         }
    //         else
    //         {
    //             return mid;
    //         }
    //         index = mid;
    //     }

    //     return index + 1;
    // }

    public static int getIndex(int arr[], int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            while(arr[i] >= target)
                return i;
        }
        return arr.length;
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 3, 5, 6};
        int target = 2;
        int index = getIndex(arr, target);
        System.out.println(index);
    }
}
