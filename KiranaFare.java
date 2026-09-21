import java.util.Scanner;

class KiranaFare
{
    static float getKiranaFare(float quantity, float price)
    {
        return quantity * price;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name= sc.next();

        System.out.println("Enter the item you bought : ");
        String item = sc.next();

        System.out.println("Enter the quantity : ");
        float quantity = sc.nextInt();

        System.out.println("Enter the price : ");
        float price = sc.nextFloat();

        float kirana_fare = getKiranaFare(quantity, price);

        System.out.println(name + " | " + item + " | " + quantity + " x " +
        "Rs " + price + " = Rs." + kirana_fare);
    }
}