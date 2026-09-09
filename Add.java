import java.util.Scanner;

class Add
{

    // 1) Using static method.
    // static void add(int a, int b)
    // {
    //     int c = a + b;
    //     System.out.println("Sum is : " + c);
    // }

    // 2) Using Instance method
    void add(int a, int b)
    {
        int c = a + b;
        System.out.println("Sum is : " + c);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = sc.nextInt();
        System.out.println("Enter number2 : ");
        int b = sc.nextInt();

        // 1) Using static method.
        //add(a,b);

        // 2) Using Instance method.
        Add c = new Add();
        c.add(a,b);
    }
}