public class FindIndexes
{
    public static int[] getIndices(char ch[], int key)
    {
        int count = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == key)
                count++;
        }

        if(count == 0)
            return new int[]{0};

        int res[] = new int[count];
        int j = 0;
        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] == key)
            {
                res[j] = i;
                j++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        char ch[] = {'h', 'e', 'l', 'l', 'o'};
        int indices[] = getIndices(ch, 'a');
        for(int i = 0; i < indices.length; i++)
        {
            System.out.print(indices[i] + " ");
        }
    }
}
