import java.util.Scanner;

class ArrayInputFromUser
{

    void modifyForEach(int a[])
    {
        for(int x : a)
        {
            x = x * 10;
        }
    }

    void modifyFor(int a[])
    {
        for(int x = 0; x < a.length; x++)
        {
            x = x * 10;
        }
    }

    void display(int a[])
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements");
        int a[] = new int[size];

        ArrayInputFromUser d = new ArrayInputFromUser();
        for(int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        d.display(a);

        System.out.println("Modifying array using for each : ");
        d.modifyForEach(a);
        d.display(a);

        System.out.println("Modifying array using for : ");
        d.modifyFor(a);
        d.display(a);



    }
}