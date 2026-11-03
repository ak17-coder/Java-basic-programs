class TwoDArray
{
    public static void printSumOfElements(int a[][])
    {
        if(a == null || a.length == 0)
            return;

        int sum = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                sum = sum + a[row][col];
            }
        }
        System.out.println("Sum of elements are : " + sum);
    }

    public static int getMax(int a[][])
    {
        if(a == null || a.length == 0)
            return 0;

        int max = a[0][0];

        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] > max)
                    max = a[row][col];
            }
        }
        return max;
    }

    public static int getMin(int a[][])
    {

        if(a == null || a.length == 0)
            return 0 ;

        int min = a[0][0];

        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] < min)
                    min = a[row][col];
            }
        }
        return min;
    }

    public static int[] getEvenAndOddCount(int a[][])
    {
        if(a == null || a.length == 0)
            return new int[]{0, 0};

        int evenCount = 0;
        int oddCount = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
        }
        return new int[]{oddCount, evenCount};
    }

    public static boolean isKeyPresent(int a[][], int key)
    {

        if(a == null || a.length == 0)
        {
            System.out.println("Array is null or empty");
            return false;
        }

        for(int x[] : a)
        {
            for(int y : x)
            {
                if(y == key)
                    return true;
            }
        }
        return false;
    }

    public static void printMainDiagonal(int a[][])
    {
        if(a == null || a.length == 0)
            return;

        for(int row = 0; row < a.length; row++)
        {
            System.out.println(a[row][row]);
        }
    }

    public static void printSecondaryDiagonal(int a[][])
    {
        if(a == null || a.length == 0)
            return;

        for(int row = 0; row < a.length; row++)
        {
            System.out.println(a[row][(a[row].length - 1) - row]);
        }
    }

    public static int[][] getScalarMultiplication(int a[][], int key)
    {
        if(a == null || a.length == 0)
            return null;

        int resArray[][] = new int[a.length][a[0].length];

        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                resArray[row][col] = a[row][col] * key;
            }
        }

        return resArray;
    }

    public static int sumOfEvenElements(int a[][])
    {
        if(a == null || a.length == 0)
            return 0;

        int evenSum = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] % 2 == 0)
                    evenSum = evenSum + a[row][col];
            }
        }
        return evenSum;
    }

    public static void getSumOfEachRow(int a[][])
    {

        for(int row = 0; row < a.length; row++)
        {
            int rowSum = 0;

            for(int col = 0; col < a[row].length; col++)
            {
                rowSum = rowSum + a[row][col];
            }
            System.out.println(rowSum);
        }
    }

    public static void getSumOfEachCol(int a[][])
    {

        for(int row = 0; row < a.length; row++)
        {
            int colSum = 0;

            for(int col = 0; col < a[row].length; col++)
            {
                colSum = colSum + a[col][row];
            }
            System.out.println(colSum);
        }
    }

    public static int getSumOfElementsGT50(int a[][])
    {
        int sum = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] > 50)
                    sum = sum + a[row][col];
            }
        }
        return sum;
    }

    public static int[] getMaxInEachRow(int a[][])
    {
        int res[] = new int[a.length];

        for(int row = 0; row < a.length; row++)
        {
            int max = 0;
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] > max)
                    max = a[row][col];
            }

            res[row] = max;
        }
        return res;
    }

    public static int getMinEven(int a[][])
    {
        int minEven = a[0][0];
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] % 2 == 0)
                {
                    if(a[row][col] < minEven)
                        minEven = a[row][col];
                }
            }
        }
        return minEven;
    }

    public static int[][] getMainDiagonalBy10(int a[][])
    {
        int res[][] = new int[a.length][a[0].length];

        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(row == col)
                    res[row][col] = a[row][col] * 10;
                else
                    res[row][col] = a[row][col];
            }
        }
        return res;
    }

    public static int getCountOfElement(int a[][], int key)
    {
        int keyCount = 0;
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(a[row][col] == key)
                    keyCount++;
            }
        }
        return keyCount;
    }

    public static boolean  isKeyPresentInMainDiagonal(int a[][], int key)
    {
        for(int row = 0; row < a.length; row++)
        {
            for(int col = 0; col < a[row].length; col++)
            {
                if(row == col)
                {
                    if(a[row][col] == key)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int a[][] = {{1, 90, 9}, {57, 6, 3}, {4, 8, 1}};

        // Sum of Elements
        printSumOfElements(a);

        System.out.println();

        // Getting Max
        int max = getMax(a);
        System.out.println("Maximum element in 2D array is : " + max);

        System.out.println();

        // Getting Min
        int min = getMin(a);
        System.out.println("Minimum element in 2D array is : " + min);

        System.out.println();

        // Get even and odd count
        int evenAndOddCount[] = getEvenAndOddCount(a);
        System.out.println("Odd count is : " + evenAndOddCount[0]);
        System.out.println("Even count is : " + evenAndOddCount[1]);

        System.out.println();

        // Find Element
        boolean found = isKeyPresent(a, -1);
        if(found)
            System.out.println("Element is found");
        else
            System.out.println("Element is not found");

        // Print Main diagonal
        System.out.println("Main Diagonal : ");
        printMainDiagonal(a);

        System.out.println();

        // Print Secondary diagonal
        System.out.println("Secondary Diagonal : ");
        printSecondaryDiagonal(a);

        System.out.println();

        // Print scaler Multiplication
        int scalarMul[][] = getScalarMultiplication(a, 2);
        System.out.println("Scaler Multiplication : ");
        for(int x[] : scalarMul)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Sum of even elements
        int evenSum = sumOfEvenElements(a);
        System.out.println("Sum of even elements are : " + evenSum);

        System.out.println();

        // Sum of each row
        System.out.println("Sum of each row : ");
        getSumOfEachRow(a);

        System.out.println();

        // Sum of each col
        System.out.println("Sum of each column : ");
        getSumOfEachCol(a);

        System.out.println();

        // Sum of elements greater than 50
        System.out.println("Sum of elements greater than 50 : ");
        int GT50 = getSumOfElementsGT50(a);
        System.out.println(GT50);

        System.out.println();

        // Max in rach row
        int eachRowMax[] = getMaxInEachRow(a);
        for(int x = 0; x < eachRowMax.length; x++)
            System.out.println("Row " + (x + 1) + " max : " + eachRowMax[x]);

        System.out.println();

        // Find min even
        int minEven = getMinEven(a);
        System.out.println("Minimum even in matrix : " + minEven);

        System.out.println();

        // Multiply main diagonal by 10
        int mainDiagonal[][] = getMainDiagonalBy10(a);
        System.out.println("Main diagonal multiplied by 10 : ");
        for(int x[] : mainDiagonal)
        {
            for(int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Get count of an element
        int count = getCountOfElement(a, 3);
        System.out.println("Count of key element is : " + count);

        System.out.println();

        // Search Element only in main diagonal
        boolean res = isKeyPresentInMainDiagonal(a, 3);
        if(res)
            System.out.println("Element found in main diagonal");
        else
            System.out.println("Element is not present in main diagonal");
    }
}