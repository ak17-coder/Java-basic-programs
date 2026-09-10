import java.util.Scanner;

public class LoginCheck
{
    public static void main(String[] args)
    {
        // String username = "admin";
        // String password = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = sc.nextLine();

        System.out.println("Enter password : ");
        String password = sc.nextLine();

        if(username.equals("admin") && password.equals("1234"))
        {
            System.out.println("Login successfully done");
        }
        else
        {
            System.out.println("Invalid credentials");
        }
    }
}
