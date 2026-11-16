class CharAndStrings
{
    public static int countSpecialChar(char ch[])
    {
        int spCnt = 0;

        for(int i = 0; i < ch.length; i++)
        {
            if(!((ch[i] >= 'A' && ch[i] <= 'Z') ||(ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= '0' && ch[i] <= '9')))
            {
                spCnt++;
            }
        }
        return spCnt;

    }

    public static int countKey(char ch1[], char key)
    {
        int cnt = 0;
        for(int i = 0; i < ch1.length; i++)
        {
            if(key == ch1[i])
                cnt++;
        }
        return cnt;
    }

    public static char getLargestChar(char ch[])
    {
        char largest = ch[0];

        for(char c : ch)
        {
            if(largest < c)
                largest = c;
        }

        return largest;

    }

    public static char getLargestCharInString(String name)
    {
        char largest = name.charAt(0);

        for(int i = 1; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            if(largest < ch)
                largest = ch;
        }
        return largest;
    }

    public static char[] replaceVowelsWithStar(char ch[])
    {

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                ch[i] = '*';
        }
        return ch;
    }

    // LC - 58
    public static int lengthOfLastWord()
    {
        String s = "Hello World  ";
        int i = s.length() - 1;
        int count = 0;
        while(i >= 0 && s.charAt(i) == ' ')
            i--;

        while(i >= 0 && s.charAt(i) != ' ')
        {
            count++;
            i--;
        }

        return count;
    }

    // LC - 557
    public static void reverseWord()
    {
        char ch[] = {'L', 'e', 't', '\'', 's', ' ', 'C', 'o', 'd', 'e'};
        int start = 0;

        for(int end = 0; end < ch.length; end++)
        {
            if(end == ch.length - 1 || ch[end] == ' ')
            {
                int left = start;
                int right = end - 1;

                while(left < right)
                {
                    char temp = ch[left];
                    ch[left] = ch[right];
                    ch[right] = temp;

                    left++;
                    right--;
                }
                start = end + 1; // Next word start is set

            }

        }
        System.out.println("After reversing");
        for(char c : ch)
            System.out.print(c + " ");

    }

    // Strings in build methods
    // converts string to char array
    // String is immutable, but char is mutable
    // syntax : char[] arr  = str.charArray()

    public static void demotoCharArray()
    {
        String s = "Anirudh";
        char c[] = s.toCharArray();
        for(char ch : c)
            System.out.println(ch);

    }

    // equals()
    //this compares two string for exact equality
    // this compares content
    //syntax : str1.equals(str2)

    public static void demoEquals()
    {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }

    public static void demoEqualsToIgnoreCase()
    {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "java";

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));
    }

    // compareTo()
    // compare two strings lexicographically
    // returs 0 if string are equal
    // < 0 --> first string comes before second
    // > 0 --> first string comes after second
    // comparision is based on unicode values

    public static void demoCompare()
    {
        String s1 = "App";
        String s2 = "A";

        System.out.println(s1.compareTo(s2));
    }

    public static void main(String[] args)
    {
        char ch[] = {'A', 'f', '3','@', '%'};
        int count = countSpecialChar(ch);
        System.out.println("Special character count : " + count);

        char ch1[] = {'J', 'a', 'v', 'a', 'a'};
        int cnt = countKey(ch1, 'a');
        System.out.println("Key count : " + cnt);

        char ch2[] = {'A', 'n', 'i', 'r', 'u', 'd', 'h', 'U'};
        char largest = getLargestChar(ch2);
        System.out.println("Largest character is : " + largest);

        String name = "Anirudh";
        char largestChar = getLargestCharInString(name);
        System.out.println(largestChar);

        char ch3[] = {'a', 'e', 'w', 'e'};
        System.out.print("Before replacing with *: ");
        for(char a : ch3)
            System.out.print(a + " ");

        System.out.println();

        System.out.print("After replacing with *: ");
        char ch4[] = replaceVowelsWithStar(ch3);
        for(char c : ch4)
            System.out.print(c + " ");

        System.out.println();

        int c = lengthOfLastWord();
        System.out.println(c);

        reverseWord();
        demotoCharArray();
        demoEquals();
        demoEqualsToIgnoreCase();
        demoCompare();

    }
}