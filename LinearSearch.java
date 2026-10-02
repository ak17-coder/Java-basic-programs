
import java.util.Scanner;

public class LinearSearch
{
    public static void linearSearch(int arr[], int key)
    {
        boolean found = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Element Not found");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to find:");
        int key = sc.nextInt();

        linearSearch(arr, key);
    }
}
