import java.util.Scanner;

class IncomeTax5
{

    static void tax(int salary)
    {
        if(salary <= 400000)
            System.out.println("0% or No Tax");
        else if(salary >= 400001 && salary <= 800000)
            System.out.println("5% Tax");
        else if(salary >= 800001 && salary <= 1200000)
            System.out.println("10% Tax");
        else if(salary >= 1200001 && salary <= 1600000)
            System.out.println("15% Tax");
        else if(salary >= 1600001 && salary <= 2400000)
            System.out.println("20% to 25% Tax");
        else
            System.out.println("30% Tax");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary : ");
        int salary = sc.nextInt();

        tax(salary);
    }
}