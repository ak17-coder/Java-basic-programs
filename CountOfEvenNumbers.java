public class CountOfEvenNumbers
{
    public static int getEvenCount(int arr[])
    {
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
                evenCount += 1;
        }
        return evenCount;
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 9, 15, 40};
        int count = getEvenCount(arr);
        System.out.println(count);
    }
}
