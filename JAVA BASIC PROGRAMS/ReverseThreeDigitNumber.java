
class ReverseThreeDigitNumber
{

    public static void main(String[] args)
    {
        int num = 527;
        int reversed = 0;

        System.out.println("Before reversing : " + num);

        while (num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("After reversing : " + reversed);
    }
}
