import java.util.Scanner;

public class CountDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String n=sc.next();
        int len=String.valueOf(n).length();
        System.out.println(len);
    }
}