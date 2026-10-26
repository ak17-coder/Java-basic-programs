class CountEvenNoOfDigits
{
    public static int findNumbers(int[] nums) {

        int evenCount = 0;

        for(int i : nums)
        {
            int count = 0;
            while(i != 0)
            {
                i /= 10;
                count++;
            }

            if(count % 2 == 0)
            {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args)
    {
        int arr[] = {00, -35, -4447, 344};
        int evenCount = findNumbers(arr);
        System.out.println(evenCount);
    }
}