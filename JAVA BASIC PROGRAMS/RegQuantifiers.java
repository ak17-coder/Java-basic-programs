class RegQuantifiers
{
    public static void demoStarQuan()
    {
        String s1 = "aaabbbcc";
        String s2 = "";
        String s3 = "aaabbbc3c";

        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
        System.out.println();
    }

    public static void demoPlusQuan()
    {
        String s1 = "aaabbbcc";
        String s2 = " ";
        String s3 = "aaabbbc3c";

        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
        System.out.println();
    }

    public static void demoExactCount()
    {
        String s1 = "aaab";
        String s2 = " ";
        String s3 = "abcd";

        System.out.println(s1.matches("[abc]{4}"));
        System.out.println(s2.matches("[abc]{4}"));
        System.out.println(s3.matches("[abcd]{4}"));
        System.out.println();
    }

    // {min, max} --> check within range(used --> password should be 8 chars)
    public static void demoMinMax()
    {
        String s1 = "abccba";
        String s2 = "abccaaa";
        String s3 = "ab";

        System.out.println(s1.matches("[abc]{1}{6}"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
        System.out.println();
    }

    // question mark - 0 or 1
    public static void demoQuestionMark()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";

        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("abb?c"));
    }
    public static void main(String[] args)
    {
        demoStarQuan();
        demoPlusQuan();
        demoExactCount();
        demoMinMax();
        demoQuestionMark();
    }
}
