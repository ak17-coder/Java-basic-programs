import java.util.Scanner;

class AgeGreaterSixty1
{

    static void age(int age)
    {
        if(age > 60)
            System.out.println("Senior citizen");
        else
            System.out.println("Not a senior citizen");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        age(age);
    }
}