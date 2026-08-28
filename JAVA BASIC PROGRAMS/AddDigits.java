
class AddDigits
{

    public static void main(String[] args)
    {
        int num = 482;
        int original = num;
        int sum = 0;

        while (num != 0)
        {
            int digit = num % 10;
            num = num / 10;
            sum = sum +digit;

        }
        System.out.println("Sum of " + original + " is : " + sum);

    }
}
