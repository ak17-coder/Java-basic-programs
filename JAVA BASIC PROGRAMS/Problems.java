public class Problems
{
    public static void extractUsernameDomain()
    {
        String s = "anirudhkulkarni017@gmail.com";
        int i = s.indexOf("@");

        String username = s.substring(0, i);
        System.out.println("Username : " + username);

        String domain = s.substring(i + 1, s.indexOf("."));
        System.out.println("Domain : " + domain);
    }

    public static void isHexadecimalOrBinary()
    {
        String s = "9";
        System.out.println(s.matches("[a-fA-f0-9]"));
    }

    public static void checkDate()
    {
        String date = "1/12/2000";
        // System.out.println(date.matches("[1-31][/][1-12][/][1900-2026]"));
    }

    public static void removeSpChar()
    {
        String s = "Anir@udh)";
        String s1 = s.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(s1);
    }

    public static void removeSpaces()
    {
        String s = "Anir udh k)";
        String s1 = s.replaceAll("[\s]", "");
        System.out.println(s1);
    }

    public static void countWords()
    {
        String s = "Anir@udh)";
        String s1 = s.replaceFirst("[^a-zA-z]", "");
        System.out.println(s1.length());
    }
    public static void main(String[] args)
    {
        extractUsernameDomain();
        isHexadecimalOrBinary();
        checkDate();
        removeSpChar();
        removeSpaces();
        countWords();
    }
}
