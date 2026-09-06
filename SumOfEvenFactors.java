
    import java.util.Scanner;

    public class SumOfEvenFactors
    {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int sum = 0;

            System.out.println("Sum of factors " + num + " : ");

            for (int i = 1; i <= num; i++)
            {

                if (num % i == 0 && i % 2 == 0)
                {
                    if (i == num)
                    {
                        System.out.print(i + " = ");
                    }

                    else
                    {
                        System.out.print(i + " + ");
                    }

                        sum = sum + i;
                }
            }

            System.out.print(sum + " ");

        }
    }

