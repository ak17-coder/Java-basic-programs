import java.util.Scanner;

class Login
{

    static void login()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("You have only 3 attempts");
        for(int i = 3; i >= 1; i--)
        {
            System.out.println("Enter username : ");
            String username = sc.next();

            System.out.println("Enter password : ");
            String password = sc.next();

            if(username.equals("admin") && password.equals("java123"))
            {
                System.out.println("Login successful");
                return;
            }
            else
            {
                System.out.println("Invalid credentials");
                System.out.println("You have " + (i - 1) + " attempts left");
            }

        }
        System.out.println("Account locked");

    }
    public static void main(String[] args)
    {

        login();
    }
}