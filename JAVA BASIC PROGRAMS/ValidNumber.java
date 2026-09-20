import java.util.Scanner;

class ValidNumber
{
    static boolean isValidMobileNumber(String number)
    {
        if((number.startsWith("6") || number.startsWith("7")
            ||number.startsWith("8") || number.startsWith("9"))
            && number.length() == 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mobile number : ");
        String number = sc.nextLine();

        System.out.println(number.length());
        boolean isValid = isValidMobileNumber(number);

        if(isValid)
            System.out.println("Your mobile number is valid Indian number");
        else
            System.out.println("Your mobile number is not a valid Indian number");
    }
}