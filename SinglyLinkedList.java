class SinglyLinkedList
{
    public static void testDeleteOperations()
    {
        Node head = null;

        // Test 1)No node
        head = deleteAtAnyPosition(head, 1);
        printList(head);

        // Test 2 ) Single node, key present
        head = insertAtEnd(1, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 1);
        printList(head);

        // Test 3) Single node, key not present
        head = insertAtEnd(1, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 2);
        printList(head);

        // Test 4) Two nodes, key firt node
        head = insertAtEnd(2, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 1);
        printList(head);

        // Test 5) Two node, key second node
        head = insertAtEnd(3, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 3);
        printList(head);

        // Test 6) Two node, key not present
        head = insertAtEnd(3, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 5);
        printList(head);

        // Test 7) 3 or 4 nodes, key present middle
        head = insertAtEnd(4, head);
        head = insertAtEnd(5, head);
        head = insertAtEnd(6, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 4);
        printList(head);

        // Test 8) 3 or 4 nodes, key present at last
        head = deleteAtAnyPosition(head, 6);
        head = insertAtEnd(6, head);
        head = insertAtEnd(7, head);
        printList(head);
        System.out.println();
        head = deleteAtAnyPosition(head, 7);
        printList(head);



    }




    public static Node deleteAtStart(Node head)
    {
        if(head == null)
        {
            return null;
        }
        return head.next;
    }

    public static Node deleteAtAnyPosition(Node head, int key)
    {
        System.out.println("Delete key node,key value = " + key);
        // List is empty
        if(head == null)
            return null;

        // First node value is key
        if(head.data == key)
            return head.next;
        else if(head.next == null)
            return head;

        Node keyNode = head.next;
        Node prevNode = head;
        while(keyNode != null)
        {
            if(keyNode.data == key)
                break;
            prevNode = keyNode;
            keyNode = keyNode.next;
        }
        if(keyNode != null && keyNode.data == key)
            prevNode.next = keyNode.next;
        return head;


    }
    public static Node deleteAtEnd(Node head)
    {
        if(head == null || head.next == null)
        {
            return null;
        }
        Node lastButOne = head;
        while(lastButOne.next.next != null)
        {
            lastButOne = lastButOne.next;
        }
        lastButOne.next = null;

        return head;

    }
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

        // System.out.println("Cases of Inserting after the given key");
        // testAtKey();

        // System.out.println("Cases of deleting at start");
        testDeleteOperations();




    }
}