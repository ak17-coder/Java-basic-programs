
import java.util.Scanner;

class LibraryCount {

    static int[] getHighestAndLowestCount(int[] arr, int days)
    {
        int highest = 0;

        for (int i = 0; i < days; i++)
        {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }

        int lowest = highest;
        for (int i = 0; i < days; i++)
        {
            if (arr[i] < lowest)
            {
                lowest = arr[i];
            }
        }
        return new int[]{highest,lowest};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days : ");
        int days = sc.nextInt();

        int[] arr = new int[days];

        System.out.println("Enter number of count per day of " + days + " days");
        for (int i = 0; i < days; i++)
        {
            arr[i] = sc.nextInt();
        }

        int []highandlow = getHighestAndLowestCount(arr, days);
        System.out.println("Highest is : " + highandlow[0]);
        System.out.println("Lowest is : " + highandlow[1]);
    }
}
