class SinglyLinkedList
{
    public static void testAtStart()
    {
        // 1)No data
        System.out.println("\nNo data-inserting at beginning");
        Node head = null;
        printList(head);

        System.out.println();

        // 2) With Single data
        // Function Invocation.
        System.out.println("\nSingle data-inserting at beginning");
        head = insertAtStart(100, head);
        printList(head);

        System.out.println();

        // 3) With Multiple data
        System.out.println("\nMultiple data-inserting at beginning");
        head = insertAtStart(100, head);
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        printList(head);

        System.out.println();
    }

    public static void testAtEnd()
    {
        System.out.println("\nNo data-inserting at end");

        Node last = null;
        printList(last);

        System.out.println();

        System.out.println("\nSingle data-inserting at end");
        last = insertAtEnd(100, last);
        printList(last);

        System.out.println();

        System.out.println("\nMultiple data-inserting at end");
        last = insertAtEnd(500, last);
        last = insertAtEnd(100, last);
        last = insertAtEnd(101, last);
        last = insertAtEnd(103, last);
        last = insertAtEnd(104, last);
        printList(last);
    }

    public static void testAtKey()
    {
        Node head = null;

        head = insertAtStart(100, head);
        head = insertAtStart(101, head);
        head = insertAtStart(102, head);
        head = insertAtStart(103, head);
        head = insertAtStart(104, head);
        // printList(head);

        Node middle = null;
        insertAfterKey(head, 101, 105);
        // printList(middle);

    }

    public static void insertAfterKey(Node head, int key, int value)
    {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;

        if(head == null)
            return;
        else if(head.data == key)
        {
            head.next = newNode;
            return;
        }

        Node keyNode = head;

        while(keyNode != null && keyNode.data != key)
        {
            keyNode = keyNode.next;
        }

        if(keyNode == null)
        {
            return;
        }

        newNode.next = keyNode.next;
        keyNode.next = newNode;
        printList(keyNode);
    }

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

    public static Node insertAtEnd(int value, Node head)
    {
        Node lastNode = new Node();
        lastNode.data = value;
        lastNode.next = null;

        Node currentLastNode = head;

        if(head == null)
        {
            return lastNode;
        }

        else
        {
            while(currentLastNode.next != null)
            {
                currentLastNode = currentLastNode.next;
            }
        }

        currentLastNode.next = lastNode;
        return head;
    }


    public static void main(String[] args)
    {
        // System.out.println("Cases of Inserting at beginning");
        // testAtStart();

        // System.out.println("Cases of Inserting at end");
        // testAtEnd();

        System.out.println("Cases of Inserting after the given key");
        testAtKey();
    }
}