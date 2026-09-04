
import java.util.Scanner;

public class MultiplicationOfNnumber
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        System.out.println("=== Multiplication table of " + num + " ===" );

        // Using for loop
        // for(int i = 1; i <= 10; i++)
        // {
        //     int res = i * num;
        //     System.out.println(num + " x " + i + " = " + res);
        // }

        int i = 1;

        // using while loop
        // while(i <= 10)
        // {
        //     int res = i * num;
        //     System.out.println(num + " x " + i + " = " + res);
        //     i++;
        // }

        //using do while loop
        do
        {
            int res = i * num;
            System.out.println(num + " x " + i + " = " + res);
            i++;
        }while(i <= 10);
    }
}
