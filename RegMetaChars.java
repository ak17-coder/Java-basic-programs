class RegMetaChars
{

    // 1) Matching one digit
    public static void demoMatchOneDigit()
    {
        String a = "8";
        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
        System.out.println();
    }

    // 2) Matching one letter
    public static void demoOneWordMatch()
    {
        System.out.println("A".matches("\\w"));
        System.out.println("9".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
        System.out.println();
    }


    // 3) No digit Match
    public static void demoNoDigit()
    {
        System.out.println("a".matches("\\D"));
        System.out.println("9".matches("\\D"));
        System.out.println();
    }

    // 4) Matches Space
    public static void demoOneSpace()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("S".matches("\\s"));
        System.out.println();
    }

    // 5) Matches No space
    public static void demoNoSpace()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("S".matches("\\s"));
        System.out.println();
    }

    // 6) Matches special char(non - word)
    public static void demoNonWord()
    {
        System.out.println(" ".matches("\\W"));
        System.out.println("S".matches("\\W"));
    }

    public static void main(String[] args)
    {
        demoMatchOneDigit();
        demoOneWordMatch();
        demoNoDigit();
        demoOneSpace();
        demoNoSpace();
        demoNonWord();
    }
}