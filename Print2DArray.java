

class Print2DArray
{
    static void print2DArray(int a[][])
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printParticularRow(int a[][], int rowNumber)
    {
        // NULL check
        if(a == null)
            return;

        // Check the range of number 0 to length - 1
        if(rowNumber <= 0 || rowNumber > a.length)
            return;

        for(int i = rowNumber - 1; i < a[rowNumber].length;)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
            break;
        }
    }

    public static void printParticularRowV2(int a[][], int rowNumber)
    {
        for(int col = 0; col < a[rowNumber - 1].length; col++)
        {
            System.out.print(a[rowNumber - 1][col] + " ");
        }
    }

    public static void printParticularCol(int a[][], int colNumber)
    {
        // NULL check
        if(a == null)
            return;

        // Check the range of number 0 to length - 1
        if(colNumber <= 0 || colNumber > a.length)
            return;

        for(int row = 0; row < a.length; row++)
        {
            if(a[row].length <= colNumber - 1)
            {
                System.out.println();
                continue;
            }
            System.out.println(a[row][colNumber - 1] + " ");
        }
    }

    public static void printDiagonal(int a[][])
    {
        int c = a.length - 1;

        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(col == c)
                {
                    System.out.print(a[row][col]);
                    c--;
                }

                else if(row == col)
                {
                    System.out.print(a[row][col]);
                }

                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printLastNumberOfEveryRow(int a[][])
    {
        for(int row = 0; row < a.length; row++)
        {
            int col = a[row].length - 1;

            System.out.println(a[row][col]);
        }
    }
    public static void main(String[] args)
    {
        // int a[][] = {
        //                 {11, 12, 13, 14, 15},
        //                 {21, 22, 23, 24, 25},
        //                 {31, 32, 33, 34, 35},
        //                 {41, 42, 43, 44, 45},
        //                 {51, 52, 53, 54, 55}
        //             };
        // printDiagonal(a);

        // print2DArray(a);
        // printParticularRowV2(a, 4);

        // int a[][] = {
        //                 {11, 12, 13, 14, 15},
        //                 {21, 22, 23, 24, 25},
        //                 {31},
        //                 {41, 42, 43, 44, 45},
        //                 {51, 52, 53, 54, 55}
        //             };
        // printParticularCol(a, 2);

        // Jagged Array --> Printing last number of every col.
        // int a[][] = {
        //                 {11,15},
        //                 {21, 22, 25},
        //                 {31, 32, 33, 34},
        //                 {41, 42, 43, 44, 45},
        //                 {51, 52, 53, 54}
        //             };

        // printLastNumberOfEveryRow(a);
    }
}