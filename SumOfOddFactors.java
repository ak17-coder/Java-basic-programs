import java.util.Scanner;

    public class SumOfOddFactors
    {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int sum = 0;

            System.out.println("Factors are : ");
            for (int i = 1; i <= num; i++)
            {

                if (num % i == 0 && i % 2 != 0)
                {
                    sum = sum + i;
                    System.out.println(i + " ");
                }
            }

            System.out.println("Sum of factors " + num + " : ");
            System.out.print(sum + " ");

        }
    }


