public class Votes
{
    public static char mostVotes(char ch1[], char ch2[], char ch3[])
    {
        int Acount = 0;
        int Bcount = 0;

        for(int i = 0; i < ch1.length; i++)
        {
            if(ch1[i] == 'A')
                Acount++;
            else
                Bcount++;
        }

        for(int j = 0; j < ch2.length; j++)
        {
            if(ch2[j] == 'A')
                Acount++;
            else
                Bcount++;
        }

        for(int k = 0; k < ch3.length; k++)
        {
            if(ch3[k] == 'A')
                Acount++;
            else
                Bcount++;
        }

        if(Acount > Bcount)
            return 'A';
        else
            return 'B';
    }
    public static void main(String[] args)
    {
        char ch1[] = {'A','B','A'};
        char ch2[] = {'A', 'B'};
        char ch3[] = {'A', 'B'};

        char res = mostVotes(ch1, ch2, ch3);
        System.out.println(res);
    }
}
