public class DiffOfLargestAndSmallest
{
    public static int getDiffOfLargestAndSmallest(int arr[])
    {
        if(arr == null || arr.length == 0)
            return -1;

        int largest = arr[0];
        int smallest = arr[0];
        for(int x : arr)
        {
            if(x > largest)
                largest = x;

            if(smallest > x)
                smallest = x;
        }
        return largest - smallest;


    }
    public static void main(String[] args)
    {
        int arr[] = {14, 3, 27, 9};

        int res = getDiffOfLargestAndSmallest(arr);
        System.out.println(res);
    }
}
