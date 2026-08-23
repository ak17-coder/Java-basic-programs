import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int m=sc.nextInt();
        System.out.println("Enter 2nd number");
        int n=sc.nextInt();
        System.out.println("Before swapping: m = " + m + ", n = " + n);

        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}