class PrintArray
{
    public static void main(String[] args)
    {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int b[][] = new int[0][5];
        // int c[][] = new int[][4];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }

        // Length of row 0
        // System.out.println(a[0].length);

        // Length of rows
        // System.out.println(a.length);

        // Using for-each loop
        // for(int[] x : a) // Passed reference to x
        // {
        //     for(int y : x) // Passed element to y
        //     {
        //         System.out.print(y + " ");
        //     }
        //     System.out.println();
        // }
    }
}