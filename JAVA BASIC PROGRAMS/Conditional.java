import java.util.*;
class Conditional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");

        int age = sc.nextInt();

        //if
        /*if(age >= 18)
        {
            System.out.println("Eligible");
        }*/

        //if-else
        /*if(age >= 18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }*/

        // if-else-if
        /*if(age == 18 )
        {
            System.out.println("Your are Eligible.Congrats this will br your first vote");
        }
        else if(age >= 18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("Not eligible.You are less than 28");
        }*/

        // Nested if-else
        System.out.println("Indian Citizenship(true/false) : ");
        boolean citizenship = sc.nextBoolean();

        /*if (age >= 18)
        {
            if (citizenship)
            {
                System.out.println("Eligible to vote in India");
            }
            else
            {
                System.out.println("Not eligible to vote in India");
            }
        }
        else
        {
            System.out.println("You are less than 18.Not eligible");
        }*/

        //Switch case
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter day numbers(1-7) : ");

        int day = sc.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Wrong input");

        }*/

        //switch case using ternery operator(? :)
        /*String result = (age >= 18) ? "Yes" : "No";
        switch(result)
        {
            case "Yes":
                System.out.println("Eligible");
                break;
            case "No":
                System.out.println("Not eligible");
                break;
            default:
                System.out.println("Invalid");
        }*/

        if(age >= 18 && citizenship)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not eligible");
        }
    }
}
