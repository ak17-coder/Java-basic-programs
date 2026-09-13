import java.util.Scanner;

public class Library20
{

    static void library(String arr[], String target)
    {
        boolean found = false;
        for(int i = 0; i < arr.length; i++)
        {
            if(target.equalsIgnoreCase(arr[i]))
            {
                System.out.println("Book Found");
                found = true;
                return;
            }
        }
        if(!found)
            System.out.println("Not found");
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target");
        String target = sc.next();
        String[] arr = {"Java", "C++", "Python", "Javascript"};
        library(arr, target);
    }
}
