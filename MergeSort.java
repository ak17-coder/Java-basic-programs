class MergeSort
{
    static void mergeSort(int arr[], int low, int high)
    {
        if(low >= high)
        {
            return;
        }

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);

    }

    static void merge(int arr[], int low, int mid, int high)
    {
        int temp[] = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                temp[k] = arr[i];
                i++;
            }

            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while(i <= mid)
        {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int a = low, b = 0; a <= high; a++ , b++)
        {
            arr[a] = temp[b];
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, low, high);

        for(int x : arr)
        {
            System.out.println(x);
        }

    }
}