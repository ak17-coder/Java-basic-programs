// class UpperCase3
// {
//     public static char[] convertToUpperCase(char ch[])
//     {
//         int count = 0;
//         for(int x = 0; x < ch.length; x++)
//         {
//             char a = Character.toUpperCase(ch[x]);

//             ch[x] = a;
//         }
//         return ch;
//     }
//     public static void main(String[] args)
//     {
//         char ch[] = {'b', 'a', 'n', 'a', 'n', 'a'} ;
//         char res[] = convertToUpperCase(ch);
//         for(char x : res)
//         {
//             System.out.print(x + " ");
//         }
//     }
// }
class UpperCase3
{
    public static char[] getUpperCase(char c[])
    {
        char ch[] = new char[c.length];
        for(int i = 0; i < c.length; i++)
        {
            if(c[i] >= 'a' && c[i] <= 'z')
            {
                int x = (int)(c[i]);
                x = x - 32;
                ch[i] = (char)x;
            }
        }

        return ch;
    }
    public static void main(String[] args)
    {
        char ch[] = {'c', 'o', 'd', 'e',};
        System.out.println("before Converting to uppercase");
        for(char i : ch)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        char c[] = getUpperCase(ch);

        System.out.println("After converting to uppercase");
        for(char i : c)
        {
            System.out.print(i + " ");
        }
    }
}