public class TestStack
{
    
    public static void main(String[] args)
    {
        MyStack stack = new MyStack(3);

        stack.pop();
        stack.peek();
        stack.push(6);
        stack.push(6);
        stack.push(0);

        stack.display();

        boolean res = stack.palindrome();
        System.out.println(res);

        stack.reverse();

        stack.display();
    }

    
}
