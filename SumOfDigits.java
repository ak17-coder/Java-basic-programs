public class SumOfDigits
{
    public static int[] getSumOfDigits(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            int num = arr[i];
            while(num > 0 || num < 0)
            {
                num = Math.abs(num);
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            arr[i] = sum;
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = {-93, 123, 45, 89};
        int res[] = getSumOfDigits(arr);
        for(int x : res)
        {
            System.out.print(x + " ");
        }
    }
}
