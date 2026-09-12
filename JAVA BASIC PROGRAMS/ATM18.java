import java.util.Scanner;

class ATM18
{
    static int deposit(int amount, int deposit)
    {
        deposit = deposit + amount;
        return deposit;
    }

    static int withdraw(int amount, int withdraw)
    {
        withdraw = amount - withdraw;
        return withdraw;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("<--- Welcome to ATM--->");
        System.out.println();

        System.out.println("Firstly, please deposit some money your account has zero balance.");
        int amount = sc.nextInt();
        System.out.println();

        System.out.println("Please insert your card(Press any number. Ex : 5) : ");
        String enter = sc.next();
        System.out.println();

        System.out.println("What you want to do : ");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Total balance");

        System.out.println();
        System.out.print("Enter your choice : ");

        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                System.out.println("Enter how much money you want to deposit :");
                int deposit = sc.nextInt();
                int depositBalance = deposit(amount, deposit);
                System.out.println("Your balance is " + depositBalance);
                break;

            case 2:
                System.out.println("Enter how much money you want to withdraw :");
                int withdraw = sc.nextInt();
                int withdrawBalance = withdraw(amount, withdraw);
                System.out.println("Your balance is " + withdrawBalance);
                break;

            default:
                System.out.println("Invalid operation");

        }
    }
}