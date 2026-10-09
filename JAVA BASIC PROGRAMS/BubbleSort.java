class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        if(arr == null || arr.length == 0 || arr.length == 1)
            return;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length-1; j++)
            {
                if(arr[j] < arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[])
    {
        if(arr == null)
            System.out.println("Array is null");

        if(arr.length == 0)
            System.out.println("Array is empty");

        if(arr.length == 1)
            System.out.println("Array has only one element cannot sort.");

        for(int x : arr)
        {
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args)
    {
        // int arr[] = null;
        // printArray(arr);

        int arr1[] = {1};
        System.out.println("Before Sorting:");
        printArray(arr1);

        System.out.println();
        bubbleSort(arr1);

        System.out.println("After Sorting:");
        printArray(arr1);

        System.out.println();

        int arr2[] = {1, 2, 3, 4, 5};
        System.out.println("Before Sorting:");
        printArray(arr2);

        System.out.println();
        bubbleSort(arr2);

        System.out.println("After Sorting:");
        printArray(arr2);




    }

}