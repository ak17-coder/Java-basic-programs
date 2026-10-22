class Recursion
{
    // public static void function(int n)
    // {
    //     //Work before call
    //     if(n > 0)
    //     {
    //         System.out.println("Enter : " +n);

    //         function(n - 1);

    //         System.out.println("Enter : " +n);

    //     }
    // }

    // public static void function(int n)
    // {
    //     //Work after call
    //     if(n > 0)
    //     {
    //         function(n - 1);
    //         System.out.println(n);

    //     }
    // }

    // public static void function(int n)
    // {
    //     //Work after call
    //     if(n > 0)
    //     {
    //         function(n - 1);

    //         System.out.println(n);
    //         function(n - 1);
    //     }
    // }

    public static void function(int n)
    {
        //Work after call
        if(n > 0)
        {
            function(n - 1);
            System.out.println(n);

        }
    }
    public static void main(String[] args)
    {
        function(1);
    }
}