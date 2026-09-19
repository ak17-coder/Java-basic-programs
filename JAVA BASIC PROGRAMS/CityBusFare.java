import java.util.Scanner;

class CityBusFare
{
    static float  getTicketFare(float km, boolean isSenior)
    {
        if(isSenior)
            return ((km * 2) + 10) / 2;
        else
            return ((km * 2) + 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many kilometers travelled : ");
        float km = sc.nextFloat();

        System.out.println("Are you senior citizen");
        boolean isSenior = sc.nextBoolean();

        float ticket_fare = getTicketFare(km, isSenior);
        System.out.println(ticket_fare);
    }
}