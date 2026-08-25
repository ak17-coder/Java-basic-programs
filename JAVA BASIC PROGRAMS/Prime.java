import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        boolean a=false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                a=true;
            }
        }
        if(a){
            System.out.println("Not prime number");
        }
        else{
            System.out.println("A prime number");
        }
    }
}
