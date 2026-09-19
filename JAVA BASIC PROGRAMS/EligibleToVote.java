import java.util.Scanner;

class EligibleToVote
{
    static boolean isEligibleToVote(int age)
    {
        if(age >= 18)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        boolean eligible = isEligibleToVote(age);

        if(eligible)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}