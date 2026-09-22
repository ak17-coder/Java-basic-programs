public class SecondLargest
{
    int getSecondLargest(int []arr)
    {
        int firstLargest = 0;
        int secondLargest = 0;
        for(int x : arr)
        {
            if(x > firstLargest)
            {
                secondLargest = firstLargest;
                firstLargest = x;
            }

            else
            {
                secondLargest = x;
            }
        }
        return secondLargest;
    }
    public static void main(String[] args)
    {
        SecondLargest s = new SecondLargest();
        int arr[] = {5,10,15,21};

        System.out.println(s.getSecondLargest(arr));

    }
}
