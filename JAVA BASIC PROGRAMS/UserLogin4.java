import java.util.Scanner;

class UserLogin4
{

    static void login(String username, String password)
    {
        if(username.equals("admin") && password.equals("java123"))
            System.out.println("Login successful");
        else
            System.out.println("Ivalid credentials");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();

        login(username, password);
    }
}