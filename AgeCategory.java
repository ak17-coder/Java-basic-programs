
import java.util.Scanner;

public class AgeCategory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if (age > 0 && age <= 12)
        {
            System.out.println("You are child");
        }

        else if(age >= 13 && age <= 17)
        {
            System.out.println("You are teenager");
        }

        else if(age >= 18 && age <= 60)
        {
            System.out.println("You are adult");
        }

        else
        {
            System.out.println("You are senior citizen");
        }
    }
}
