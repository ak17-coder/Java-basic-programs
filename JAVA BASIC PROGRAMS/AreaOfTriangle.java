import java.util.Scanner;

class AreaOfTriangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double base, height, area;
        System.out.println("Enter base: ");
        base = sc.nextInt();
        System.out.println("Enter height: ");
        height = sc.nextInt();
        area = 1/2f * base * height;
        System.out.println(area);

    }
}