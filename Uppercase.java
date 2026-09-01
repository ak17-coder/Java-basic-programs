import java.util.Scanner;

public class Uppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch))
        {
            System.out.println("Character is uppercase");
        }
        else
        {
            System.out.println("Character is not uppercase");
        }
    }
}
