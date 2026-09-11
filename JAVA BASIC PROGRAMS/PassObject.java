// public class PassObject
// {

//     static void update(int b[])
//     {
//         b[0] = 100;

//         System.out.println("Inside update " + b[0]);
//     }
//     public static void main(String[] args)
//     {
//         int a[] = {10, 20, 30, 40};
//         System.out.println("Before method call " + a[0]);

//         update(a);

//         System.out.println("After method call " + a[0]);
//     }
// }

class PassObject
{

    static int[] update()
    {
        int a[] = {10,20,30,40};
        return  a;
    }
    public static void main(String[] args)
    {
        int b[] = update();

        System.out.println("Before Modification :");

        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }

        b[0] = 100;

        System.out.println();

        System.out.println("After Modification :");
        for(int i = 0; i < b.length; i++)
        {
            System.out.print(b[i] + " ");
        }

    }
}
