class SinglyLinkedList
{
    public static void printList(Node head)
    {
        Node temp = head;

        System.out.print("head" + " --> ");
        while(temp != null)
        {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    // Function Definition.
    public static Node insertAtStart(int value, Node currentHead)
    {
        // Creation of new node and set the values
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        // Test Cases
        // 1) Head is null or list is empty
        if(currentHead == null)
        {
            return newNode;
        }

        // 2) Head is not null or list is empty or there are one or more nodes
        else
        {
            newNode.next = currentHead;
            return newNode;
        }
    }

    public static Node insertAtEnd(int value, Node currentHead)
    {
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        Node temp = currentHead;
        if(currentHead == null)
        {
            return lastNode;
        }

        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = lastNode;
        }
        return lastNode;
    }


    public static void main(String[] args)
    {
        // 1)No data
        Node head = null;
        printList(head);

        System.out.println();

        // 2) With Single data
        // Function Invocation.
        head = insertAtStart(100, head);
        printList(head);

        System.out.println();

        // 3) With Multiple data
        head = insertAtStart(100, head);
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        printList(head);

        System.out.println();

        head = insertAtEnd(500, head);
        head = insertAtEnd(100, head);
        head = insertAtEnd(101, head);
        head = insertAtEnd(102, head);
        head = insertAtEnd(103, head);
        head = insertAtEnd(104, head);
        printList(head);

    }
}