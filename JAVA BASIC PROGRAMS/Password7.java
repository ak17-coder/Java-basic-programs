
class Password7 {

    public static boolean checkPassword(char ch[]) {
        for (char x : ch) {
            if ((x >= '0' && x <= '9') && ch.length == 8) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char ch[] = {'a', 'a', 'd', '1', 'n', 'a', 'w', 'r'};
        boolean res = checkPassword(ch);
        System.out.println(res);
    }
}
