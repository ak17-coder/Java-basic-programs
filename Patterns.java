public class Patterns
{
    public static void main(String[] args)
    {
        int i = 1;

        // Patterns using do-while
        // do
        // {
        //         int j = 1;
        //         do
        //         {
        //             System.out.print("*"+ " ");
        //             j++;
        //         }while(j <= 4);
        //         System.out.println();
        //     i++;
        // }while(i <= 4);

        // Patterns using while
        // while (i <= 3)
        // {
        //         int j = 1;

        //         while (j <= 4)
        //         {
        //             System.out.print("* ");
        //             j++;
        //         }
        //     i++;
        //     System.out.println();
        // }

        // Patterns using for and while
        for (int i1 = 1; i1 <= 3; i1++)
        {
                int j = 1;
                while (j <= 4)
                {
                    System.out.print("*" + " ");
                    j++;
                }
            System.out.println();
        }
    }
}
