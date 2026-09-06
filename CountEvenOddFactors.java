
    import java.util.Scanner;

    public class CountEvenOddFactors
    {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int sum = 0;
            int countEven = 0;
            int countOdd = 0;

            for (int i = 1; i <= num; i++)
            {

                if (num % i == 0)
                {
                    if(i % 2 == 0)
                    {
                    countEven += 1;
                    }

                    else
                    {
                        countOdd += 1;
                    }
                }
            }

            System.out.println("Even factors : " + countEven);
            System.out.println("Odd factors : " + countOdd);

        }
    }
