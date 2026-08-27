
public class SwappingFourNumbersUsingVariables
{

    public static void main(String[] args) {
        int a = 200;
        int b = 100;
        int c = 330;
        int d = 400;

        System.out.println("==Before swapping===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println();

        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        System.out.println("==After swapping===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
