import java.util.Scanner;

class MonthlyElectricity
{
    static float getElectricityBill(int units, float price_per_unit)
    {
        return units * price_per_unit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How much number of units used this month : ");
        int units = sc.nextInt();

        System.out.println("What is the price per unit : ");
        float price_per_unit = sc.nextFloat();

        float bill = getElectricityBill(units, price_per_unit);
        System.out.println(bill);
    }
}