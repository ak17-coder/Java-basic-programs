class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class StackLL
{
    Node top;

    StackLL()
    {
        top = null; // No node is created
    }

    // push()

    void push(int value)
    {
        Node newNode = new Node(value);

        newNode.next = top; // It holding head address where head == top;

        top = newNode; // head is pointing to new node

        System.out.println(value + " pushed");
    }

    // pop()
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = top.data;
        top = top.next; // this deletes first value
        return value; // temporary var which stores value;
    }

    // peek()
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // peek at position
    // posn starts from 1(top == posn 1)
    int peek1(int pos)
    {
        if(pos <= 0)
        {
            System.out.println("Invalis pos");
            return -1;
        }

        Node temp = top;

        int count = 1; // count will remember the position of temp

        while(temp != null && count < pos)
        {
            temp = temp.next;
            count++;
        }

        if(temp == null)
        {
            System.out.println("Pos does not exist");
            return -1;
        }

        return temp.data;
    }

    // isEmpty()
    boolean isEmpty()
    {
        return top == null;
    }

    // display()
    void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        System.out.print("head ");
        while(temp != null)
        {
            System.out.print(" --> " + temp.data);
            temp = temp.next;
        }

        System.out.print(" -->" + "null");
    }
}