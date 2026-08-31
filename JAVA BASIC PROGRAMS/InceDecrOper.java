
public class InceDecrOper {

    public static void main(String[] args) {
        int cnt = 10;

        System.out.println("Post Increment");
        System.out.println(cnt++); //10
        System.out.println(cnt); //11
        System.out.println(cnt++); //11
        System.out.println(cnt++); //12
        System.out.println(cnt); //13

        System.out.println("Post decrement");
        System.out.println(cnt--); //13
        System.out.println(cnt); //12
        System.out.println(cnt--); //12
        System.out.println(cnt--); //11

        System.out.println("Pre Increment");
        System.out.println(++cnt); //11
        System.out.println(cnt); //11
        System.out.println(++cnt);// 12
        System.out.println(cnt); //13
        System.out.println(++cnt); //14

        //Behaviour in expression
        System.out.println("Behaviour in expression");
        int c = 10;
        System.out.println(c++ + 5);  //15
        System.out.println(c); //11
        System.out.println(++c + 5); //17
        System.out.println(c); //12

        System.out.println("Confusion behaviour");
        int num = 10;
        System.out.println(num++ + ++num); //10 + 12 = 22

        System.out.println("Confusion behaviour");
        int num1 = 11;
        System.out.println(num1++ + num1++); //11 + 12 = 23

        System.out.println("Confusion behaviour");
        int num2 = 12;
        System.out.println(num2++ - ++num2); //12 - 14 = -2

        System.out.println("Confusion behaviour");
        int num3 = 20;
        System.out.println(++num3 + --num3); //21 + 20 = 41


        System.out.println("");
        int a = 5,b = 10;
        System.out.println(a++ + ++b);//5 + 11 =16
        System.out.println(a); //6
        System.out.println(b); //11

        System.out.println("");
        int x = 4;
        System.out.println(++x + x++); // 5 + 5 = 10
        System.out.println(x); // 10
    }
}
