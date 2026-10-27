class QuickSort
{
    public static void quickSort(int arr[], int low, int high)
    {
        if(low >= high)
            return;

        int i = low + 1;
        int j = high;
        int pivot = arr[low];

        while(i <= j)
        {
            while(i <= high && arr[i] < pivot)
            {
                i++;
            }

            while(j > low && arr[j] >= pivot)
            {
                j--;
            }

            if(i < j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void printArray(int arr[])
    {
        for(int i : arr)
            System.out.print(i + " ");
    }
    public static void main(String[] args)
    {
        int arr[] = {90, 15, 23, 80, 32, 23, 45};
        System.out.println("Before Sorting");
        printArray(arr);

        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        System.out.println();

        System.out.println("After Sorting");
        printArray(arr);
    }
}