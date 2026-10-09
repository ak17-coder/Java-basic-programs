public class CompareValues
{
    public static void compareValues(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(i == j)
                    continue;
                if(arr[i] > arr[j])
                {
                    System.out.println(arr[i] + " > " + arr[j]);
                }
                else if(arr[i] < arr[j])
                {
                    System.out.println(arr[i] + " < " + arr[j]);
                }
                else
                {
                    System.out.println(arr[i] + " == " + arr[j]);
                }
            }
        }
    }
    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40};
        compareValues(arr);
    }
}
