public class CountIntegers
{

    int []count(int[] arr)
    {
        int countPositive = 0;
        int countNegative = 0;
        int countZeroes = 0;
        for(int x : arr)
        {
            if(x > 0)
            {
                countPositive++;
            }
            else if(x < 0)
            {
                countNegative++;
            }
            else
            {
                countZeroes++;
            }
        }
        return new int[]{countPositive, countNegative, countZeroes};
    }

    public static void main(String[] args)
    {
        CountIntegers c = new CountIntegers();
        int[] arr = {10, 20, -30, 0};
        int []res = c.count(arr);
        System.out.println("Number of positive numbers : " + res[0]);
        System.out.println("Number of negative numbers : " + res[1]);
        System.out.println("Number of zeroes : " + res[2]);
    }
}
