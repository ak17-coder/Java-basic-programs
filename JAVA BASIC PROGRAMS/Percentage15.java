import java.util.Scanner;

class Percentage15
{
    static float totalMarks(int marks1, int marks2, int marks3, int marks4)
    {
        return marks1 + marks2 + marks3 +  marks4;
    }

    static void percentage(int marks1, int marks2, int marks3, int marks4)
    {
        float per = (totalMarks(marks1, marks2, marks3, marks4) / 500f) * 100;
        System.out.println(per);
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

        percentage(marks1, marks2, marks3, marks4);
    }
}