import java.util.Scanner;

class PowersOf2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start : ");
        int start = sc.nextInt();

        System.out.println("Enter end : ");
        int end = sc.nextInt();

        System.out.println("Powers of two : ");

        // Method 1
        // if(start == 2)
        // {
        //     System.out.println(1 * start);
        // }

        // // using for loop
        // for(start = 2; start < end; start = start)
        // {
        //     start = (start * 2);
        //     System.out.println(start);
        // }

        // Method2 - using for loop
        for(start = 2; start < end; start = start * 2)
        {
            System.out.println(start);
        }

        //using while loop
        // while(start <= 64)
        // {
        //     start = start * 2;
        //     start = start;
        //     System.out.println(start);
        // }


        // using do while loop
        // do
        // {
        //     start = start * 2;
        //     start = start;
        //     System.out.println(start);
        // }while(start < end);
    }
}