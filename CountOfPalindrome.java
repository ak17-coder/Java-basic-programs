class CountOfPalindrome
{
    public static int getCountOfPalindrome(int arr[])
    {
        int count = 0;

        for(int x : arr)
        {
            int original = x;
            int reversed = 0;

            if(x == 0)
                continue;
            while(x > 0 || x < 0)
            {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }


            if(original == reversed)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {-7, 121, 337, 1331, 84, 0};
        int res = getCountOfPalindrome(arr);
        System.out.println(res);
    }
}