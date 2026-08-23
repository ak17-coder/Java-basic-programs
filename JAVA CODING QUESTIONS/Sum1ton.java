import java.util.Scanner;
public class Sum1ton{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int totalSum=0;
        for(int i=1;i<=n;i++){
            totalSum=i+totalSum;
        }
        System.out.println(totalSum);

    }
}