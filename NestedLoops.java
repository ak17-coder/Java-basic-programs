
class NestedLoops
{

    public static void main(String[] args)
    {
        for (int index = 1; index <= 3; index ++)
        {
            for (int loop1 = 1; loop1 <= 3; loop1++)
            {
                System.out.print( "(" + index + " , " + loop1 + ")" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int index = 1; index <= 1; index ++)
        {
            for (int loop1 = 1; loop1 <= 3; loop1++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

}
