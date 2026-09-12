import java.util.Scanner;

class BankLoan3
{

    static void bankEligibilty(int age, int salary)
    {
        if(age >= 21 && salary >= 30000)
            System.out.println("Loan Approved");
        else
            System.out.println("Loan is not approved");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("Enter your salary : ");
        int salary = sc.nextInt();

        bankEligibilty(age, salary);
    }
}