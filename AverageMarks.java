public class AverageMarks
{
    public static double getAverageMarks(int arr[])
    {
        if(arr == null || arr.length == 0)
            return -1;

        double sum = 0;

        for(int x : arr)
        {
            sum += x;
        }

        double avg = sum / arr.length;
        return avg;
    }
    public static void main(String[] args)
    {
        int arr[] = {70, 85, 90, 55};
        double res = getAverageMarks(arr);
        System.out.println(res);
    }
}
