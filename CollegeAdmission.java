
import java.util.Scanner;

public class CollegeAdmission
{
    public static void main(String[] args)
    {
        // int marks = 85;
        // boolean passed_exam = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        System.out.println("Passed Exam(true/false) : ");
        boolean passed_exam = sc.nextBoolean();


        if(marks >= 85 && passed_exam)
        {
            System.out.println("Eligible to take admission in college");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}
