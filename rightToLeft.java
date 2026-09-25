public class rightToLeft
{
    static void printLeftToRight(int []num)
    {
        for(int i = num.length - 1; i >= 0; i--)
        {
            if(i != 0)
            {
                System.out.print(num[i] + " --> ");
            }
            else
            {
                System.out.print(num[i] + ".");
            }
        }
    }
    public static void main(String[] args)
    {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printLeftToRight(num);
    }
}
