class InstanceMethod
{

    // Demo object of InstanceMethod
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
        // // display();
        int a = 10, b = 15; //-->parameter passing - send data - actual parameters

        // // 1) Object for each
        // // 1.
        // InstanceMethod i1 = new InstanceMethod();
        // i1.display();

        // // 2.
        // InstanceMethod i2 = new InstanceMethod();
        // i2.printSum(a,b);

        // //3.
        // // int getnumber = getNumber();
        // InstanceMethod i3 = new InstanceMethod();
        // System.out.println("Getting number : " + i3.getNumber());

        // // 4.
        // InstanceMethod i4 = new InstanceMethod();
        // int maximum = i4.max(a, b);
        // System.out.println("Maximum number is :" + maximum);


        //2) One object.Many methods
        InstanceMethod i = new InstanceMethod();
        // 1.
        i.display();

        // 2.
        i.printSum(a,b);

        //3.
        // int getnumber = getNumber();
        System.out.println("Getting number : " + i.getNumber());

        // 4.
        int maximum = i.max(a, b);
        System.out.println("Maximum number is :" + maximum);
    }
}