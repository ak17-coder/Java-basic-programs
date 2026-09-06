import java.util.Scanner;

    public class CountDivsibleBy3
    {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = sc.nextInt();

            int countDivisible = 0;

            for (int i = 1; i <= num; i++)
            {

                if (num % i == 0 && i % 3 == 0)
                {
                    System.out.println(i);
                    countDivisible += 1;
                }
            }

            System.out.println("Count divisible : " + countDivisible);

        }
    }


