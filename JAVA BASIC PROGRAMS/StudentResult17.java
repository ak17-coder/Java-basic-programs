import java.util.Scanner;

class StudentResult17
{
    static float totalMarks(int marks1, int marks2, int marks3, int marks4)
    {
        System.out.println(marks1 + marks2 + marks3 +  marks4);
        return marks1 + marks2 + marks3 + marks4;
    }

    static float percentage(int marks1, int marks2, int marks3, int marks4)
    {
        float per = (totalMarks(marks1, marks2, marks3, marks4) / 500f) * 100;
        System.out.println(per);
        return per;
    }

    static void grade(int marks1, int marks2, int marks3, int marks4)
    {
        float per = percentage(marks1, marks2, marks3, marks4);
        if(per > 90)
            System.out.println("A");
        else if(per > 80)
            System.out.println("B");
        else if(per > 60)
            System.out.println("60");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks4 = sc.nextInt();

        grade(marks1, marks2, marks3, marks4);
    }
}