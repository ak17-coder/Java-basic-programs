import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // int num = sc.nextInt();
        String num = sc.next();
        String original = num;
        String res = "";

        System.out.print(num.length());

        for (int i = num.length() - 1; i >= 0; i--) {
            res = res + num.charAt(i);
        }

        if (original.equals(res)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        String s1 = "121";
        String s2 = "120";
        System.out.println(s1 == s2);
    }

}
