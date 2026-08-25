import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        System.out.println("How many numbers?");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter number 1:");
        int largest=sc.nextInt();

        for(int i=2;i<=n;i++){
            System.out.print("Enter number " + i +":");
            int num=sc.nextInt();

            if(num>largest){
                largest=num;
            }

        }
        System.out.println("Largest number is "+ largest);

    }
}
