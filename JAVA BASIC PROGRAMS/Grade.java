import java.util.Scanner;

class Grade
{
    static char getGrade(float percentage)
    {
        if(percentage >= 90)
            return 'A';
        else if(percentage >= 75 && percentage < 90)
            return 'B';
        else if(percentage >= 60 && percentage < 75)
            return 'C';
        else if(percentage >= 40 && percentage < 60)
            return 'D';
        else
            return 'F';
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your percentage : ");
        float percentage = sc.nextFloat();

        char grade = getGrade(percentage);
        System.out.println(grade);
    }
}