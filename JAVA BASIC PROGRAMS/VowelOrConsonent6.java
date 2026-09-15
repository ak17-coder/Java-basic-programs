import java.util.Scanner;

class VowelOrConsonent6
{

    static boolean isVowel(char ch)
    {
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet : ");
        char ch = sc.next().charAt(0);

        char chUpper = Character.toUpperCase(ch);

        if(isVowel(chUpper))
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonent");
        }
    }
}