class MobileNumberCheck
{
    public static boolean checkMobileNumber(char ch[])
    {
        int count = 0;
        boolean valid = false;
        for(char x : ch)
        {
            if(x >= '0' && x <= '9')
                count++;

            else
                return valid;
        }

        if(count == 10)
            valid = true;

        return valid;
    }
    public static void main(String[] args)
    {
        char ch[] = {'e', '8','4','5','0','1','2','3','4','5'} ;
        boolean res = checkMobileNumber(ch);
        System.out.println(res);
    }
}