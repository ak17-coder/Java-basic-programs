class forEach
{
    static void show(int []a)
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        int []arr = {1,3,3,2};
        show(arr);
        // show(new int[]{1,2,3,4});
    }
}
