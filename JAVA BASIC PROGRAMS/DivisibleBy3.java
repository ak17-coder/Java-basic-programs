public class DivisibleBy3
{
    int [] getDivisibleBy3(int []arr)
    {
        int count = 0;
        for(int x : arr)
        {
            if(x % 3 == 0)
            {
                count++;
            }
        }

        int res[] = new int[count];

        int index = 0;
        for(int x : arr)
        {
            if(x % 3 == 0)
            {
                res[index] = x;
                index++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        DivisibleBy3 d = new DivisibleBy3();
        int arr[] = {5,10,15,21};

        int []res = d.getDivisibleBy3(arr);

        for(int x : res)
        {
            System.out.println(x + " ");
        }
    }
}
