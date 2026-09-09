import java.util.Scanner;

public class SquareNumber
{

    void squareNumber(int num)
    {
        int square = num * num;
        System.out.println("Square of " + num + " is : " + square);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        //squareNumber(num);

        SquareNumber sq = new SquareNumber();
        sq.squareNumber(num);
    }
}
