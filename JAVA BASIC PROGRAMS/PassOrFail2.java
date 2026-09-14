import java.util.Scanner;

class PassOrFail2
{

    static void calculateResult(int marks)
    {
        if(marks >= 35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();

        calculateResult(marks);
    }
}