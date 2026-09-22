
public class LinearSearch {

    boolean isPresent(int[] arr, int key)
    {
        for (int x : arr)
        {
            if (x == key)
                return true;

            // Error if is inside else
            // else
            //     return  false;
        }
        return false;
    }

    public static void main(String[] args)
    {
        LinearSearch l = new LinearSearch();
        int[] arr = {10, 20, 30, 40};
        System.out.println(l.isPresent(arr, 30));
        System.out.println(l.isPresent(arr, 100));

    }
}
