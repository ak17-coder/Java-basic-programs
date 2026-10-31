public class AdditionOf2DArray
{
    public static void main(String[] args)
    {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int b[][] = {{1, 0, 0}, {0, 1, 0}, {1, 0, 0}};

        int c[][] = new int[a.length][a.length];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                // If a and b have same size
                c[i][j] = a[i][j] * b[i][j];

                // If a has 3 x 3 and b has 3 x 2
                // If element is present add a and b, else add a and 0
                // if(j < 2)
                //     c[i][j] = a[i][j] + b[i][j];
                // else
                //     c[i][j] = a[i][j] + 0;

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
