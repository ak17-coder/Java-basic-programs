class Regex
{
    public static void main(String[] args)
    {
        // 1) regex .
        // dot matches any char except new line
        String s = "a";
        System.out.println(s.matches("."));

        // 2) [abc]
        // matches only a or b or c
        System.out.println(s.matches("[abc]"));

        // 3)[abc][vz]
        // matches only if starting with a or b or c and second char must be v or z
        System.out.println(s.matches("[abc][vz]"));

        // 4)[^abc]
        // matches except abc
        System.out.println(s.matches("[^abc]"));

        // 5)[a-z1-7]
        // mathces a - z or 1 - 6
        System.out.println(s.matches("[a-z1-7]"));

        
    }
}