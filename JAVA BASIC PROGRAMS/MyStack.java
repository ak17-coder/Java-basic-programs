public class MyStack
{
    int top = -1;
    int size = 0;
    int values[];

    public MyStack(int sizeOfStack)
    {
        values = new int[sizeOfStack];
        size = sizeOfStack;
    }

    public void push(int value)
    {
        if(this.top == size - 1)
        {
            System.out.println("Stack is full");
            return;
        }
        this.top++;
        this.values[this.top] = value;
    }

    public int peek()
    {
        if(this.top == -1)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return this.values[this.top];
    }

    public int pop()
    {
        if(this.top == -1)
        {
            System.out.println("Stack is empty");
            return -1000;
        }
        int index = this.top;
        this.top--;
        return this.values[index];
    }

    void display()
    {
        // for(int i = top; i >=0 ; i--)
        // {
        //     System.out.println(values[i] + " ");
        // }
        for(int i : values)
            System.out.println(i + " ");
    }

    public boolean palindrome()
    {
        int start = 0;
        int end = values.length - 1;
        while(start < end)
        {
            if(values[start] == values[end])
            {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }

    void reverse()
    {
        int start = 0;
        int end = values.length - 1;
        while(start < end)
        {
            int temp = values[start];
            values[start] = values[end];
            values[end] = temp;
        }
        for(int i : values)
            System.out.println(i + " ");
    }

    
}

