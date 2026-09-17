
import java.util.Scanner;

class MarksCard {

    static float totalMarks(int marks1, int marks2, int marks3, int marks4) {
        int total = marks1 + marks2 + marks3 + marks4;
        return total;
    }

    static float percentage(int marks1, int marks2, int marks3, int marks4) {
        float per = (totalMarks(marks1, marks2, marks3, marks4) / 500f) * 100;
        return per;
    }

    static void grade(int marks1, int marks2, int marks3, int marks4) {
        float grade = percentage(marks1, marks2, marks3, marks4);
        System.out.println("Your grade is");
        if (grade > 90) {
            System.out.println("A");
        } else if (grade > 80) {
            System.out.println("B");
        } else if (grade > 70) {
            System.out.println("C");
        } else if (grade > 90) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks2 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks3 = sc.nextInt();
        System.out.println("Enter a marks1: ");
        int marks4 = sc.nextInt();

        float total = totalMarks(marks1, marks2, marks3, marks4);
        System.out.println("Your total marks are :" + total);
        float per = percentage(marks1, marks2, marks3, marks4);
        System.out.println("Your total percentage is :" + per);
        grade(marks1, marks2, marks3, marks4);
    }
}
