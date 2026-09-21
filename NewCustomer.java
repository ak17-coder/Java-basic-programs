import java.util.Scanner;

class NewCustomer
{
    static void  getNewCustomer(int record)

    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Enter your email : ");
        String email = sc.nextLine();

        System.out.println("Enter your mobile number : ");
        String mob = sc.next();

        System.out.println("record: " + record + ", " + name + ", " + email + ", " + mob);
    }
    public static void main(String[] args)
    {

        int record = 1001;
        int record1 = 1002;
        getNewCustomer(record);
        getNewCustomer(record1);
        // System.out.println(lable);
    }
}