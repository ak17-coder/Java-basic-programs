import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        n=Math.abs(n);
        int totalSum=0;
        while(n!=0){
            int digit=n%10;
            totalSum=digit+totalSum;
            n=n/10;
        }
        System.out.println(totalSum);
    }
}
