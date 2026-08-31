
public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println("AND Operator(&)");
        int a = -11;
        int b = 6;
        System.out.println("10 & 6: " + (a & b));

        System.out.println("OR Operator(|)");
        System.out.println("10 | 6: " + (a | b));

        System.out.println("XOR Operator(^)");
        System.out.println("10 & 6: " + (a ^ b));

        System.out.println("NOT Operator(~)");
        System.out.println("(A) : " + (a));
        System.out.println("(~A) : " + (~a));
        System.out.println("(B) : " + (b));
        System.out.println("(~B) : " + (~b));

        System.out.println("Left Shift Operator(<<)");
        System.out.println("Value of a : " + (a));
        System.out.println("Shift by 1: " + (a << 1));
        System.out.println("Shift by 2: " + (a << 2));

        System.out.println("Right Shift Operator(>>)");
        System.out.println("Value of a : " + (a));
        System.out.println("Shift by 1: " + (a >> 1));
        System.out.println("Shift by 2: " + (a >> 2));

        System.out.println("Unsigned right Shift Operator(>>>)");
        byte c = -5;
        System.out.println("Value of c : " + (c));
        System.out.println("Shift by 1: " + ((byte) (c >>> 1)));
        System.out.println("Shift by 2: " + (c >>> 2));

    }
}
