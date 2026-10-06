
class Array
{
    public static void compareNumberWithArray(int arr[], int number)
    {
        if(arr == null)
        {
            System.out.println("Array is null");
            return;
        }

        if(arr.length == 0)
        {
                System.out.println("Array is empty");
                return;
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(number > arr[i])
            {
                System.out.println(number + " > " + arr[i]);
            }
            else if(number < arr[i])
            {
                System.out.println(number + " < " + arr[i]);
            }
            else
            {
                System.out.println(number + " == " + number);
            }
        }
    }
    public static void main(String[] args)
    {
        // 1)Input user
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        // System.out.println("Enter the elements");
        // int arr[] = new int[size];

        // for(int i = 0; i < size; i++)
        // {
        //     arr[i] = sc.nextInt();
        // }

        // 2) Hardcoded
        // int arr[] = null; --> array is null
        // int arr[] = new int[0]; --> arr is empty
        int arr[] = {-4, 20, -6, 30, 5};
        int number = 30;
        compareNumberWithArray(arr, number);
    }
}