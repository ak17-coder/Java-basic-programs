class InsertionSort
{
    public static void insertionSort(int arr[])
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j])
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {8, 7, 2, 4, 3};
        insertionSort(arr);
        for(int i : arr)
        {
            System.out.println(i + " ");
        }
    }
}