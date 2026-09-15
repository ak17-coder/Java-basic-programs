
public class ValidDays9
{
    static void validDays()
    {
        for(int i = 1; i <= 12; i++)
        {
            System.out.println();

            for(int j = 1; j <= 31; j++)
            {
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args)
    {

        validDays();
    }
}
