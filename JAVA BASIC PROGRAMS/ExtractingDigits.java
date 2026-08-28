
class ExtractingDigits
{

    public static void main(String[] args)
    {
        int num = 786;

        while (num != 0)
        {
            int digit = num % 10;
            num = num / 10;
            System.out.println("Extracted digit : " + digit);

        }
    }
}
