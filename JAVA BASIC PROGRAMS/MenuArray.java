import java.util.Scanner;

public class MenuArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        int size = 0;

        while (true)
        {
            System.out.println("--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Insert an Element");
            System.out.println("2. Display the Array");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    if (size >= arr.length)
                    {
                        System.out.println("Array is full!");
                    }
                    else
                    {
                        System.out.print("Enter the number to insert: ");
                        int element = sc.nextInt();
                        arr[size] = element; // Add element to the next available slot
                        size++;
                        System.out.println(element + " inserted successfully.");
                    }
                    break;

                case 2:
                    if (size == 0)
                    {
                        System.out.println("Array is empty!");
                    }
                    else
                    {
                        System.out.print("Current Array: ");
                        for (int i = 0; i < size; i++)
                        {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please select between 1 and 3.");
            }
        }
    }
}
