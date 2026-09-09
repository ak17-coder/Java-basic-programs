class StaticMethod
{
    // 1) No args and no return type(void)
    static void display()
    {
        System.out.println("Hello");
    }

    // 2) Arguments but no return
    static void printSum(int a, int b)
    {
        System.out.println("Sum = " + (a+b));
    }

    // 3) No args but return
    static int getNumber()
    {
        return 50;
    }

    // 4) args and return
    static int max(int x, int y) //--> receive data - formal parameters
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }

        //Scope checking
        //System.out.println(a); //a is not this in method.
    }
    public static void main(String[] args)
    {
        // display();
        int a = 10, b = 15; //-->parameter passing - send data - actual parameters

        // 1.
        display();

        // 2.
        printSum(a,b);

        //3.
        // int getnumber = getNumber();
        System.out.println("Getting number : " + getNumber());

        // 4.
        int maximum = max(a, b);
        System.out.println("Maximum number is :" + maximum);
    }
}