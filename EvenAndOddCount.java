public class EvenAndOddCount
{
    public static int[] getEvenAndOddCount(int arr[])
    {
        if(arr == null || arr.length == 0)
            return new int[]{-1};

        int evenCount = 0;
        int oddCount = 0;

        for(int x : arr)
        {
            if(x % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return new int[] {oddCount, evenCount};
    }
    public static void main(String[] args)
    {
        int arr[] = {3, 8, 5, 12, 7};
        int res[] = getEvenAndOddCount(arr);
        // for(int i = 0; i < res.length; i++)
        // {
        //     System.out.print(res[i] + " ");
        // }
        System.out.print("[" + res[0] + ", " + res[1] + "]");
    }
}
