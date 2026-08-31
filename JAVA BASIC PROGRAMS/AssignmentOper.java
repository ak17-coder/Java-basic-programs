
public class AssignmentOper {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("a= " + a);

        System.out.println("Assignment Operator");
        a += 5; // a += 5 --> a ="" a + 5 --> 5 + 5 = 10
        System.out.println("+= : " + a); // 10

        a -= 5;
        System.out.println("-= : " + a); // 5

        a *= 5;
        System.out.println("*= : " + a); // 25

        a /= 5;
        System.out.println("/= : " + a);//5

        a %= 5;
        System.out.println("%= : " + a);//0
    }
}
