public class AverageOfElements {

    float findAverage(int[] arr)
    {
        int sum = 0;
        for(int x : arr)
        {
            sum += x;
        }
        return sum / arr.length;
    }

    public static void main(String[] args)
    {
        AverageOfElements a = new AverageOfElements();
        int[] arr = {10, 20, 30, 40};
        System.out.println(a.findAverage(arr));
    }
}
