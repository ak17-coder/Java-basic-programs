public class Occuerence
{

    int findOccur(int[] arr, int num)
    {
        int count = 0;
        for(int x : arr)
        {
            if(x == num)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Occuerence o = new Occuerence();
        int[] arr = {10, 10, 20, 30, 40, 10};
        int num = 10;
        System.out.println(o.findOccur(arr,num));
    }
}
