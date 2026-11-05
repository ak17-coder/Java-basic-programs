public class ValidParenthesis
{
    public static boolean isValidParenthesis(String str)
    {
        if(str == null)
            return false;

        MyStack stack = new MyStack(str.length());


        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if(ch == '(')
            {
                stack.push(ch);
                continue;
            }

            if(ch == ')')
            {
                if(stack.peek() == -1)
                {
                    isBalanced = false;
                    break;
                }
                stack.pop();
            }
        }
    }
    public static void main(String[] args)
    {
        
    }
}
