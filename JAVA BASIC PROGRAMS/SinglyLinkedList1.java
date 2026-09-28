public class SinglyLinkedList1
{
    public static void main(String[] args)
    {
        Node head = new Node();

        Node FirstNode = new Node();
        Node SecondNode = new Node();
        Node ThirdNode = new Node();

        FirstNode.data = 101;
        FirstNode.next = SecondNode;

        SecondNode.data = 102;
        SecondNode.next = ThirdNode;

        ThirdNode.data = 103;
        ThirdNode.next = null;

        // 1) Inserting at beginning
        head.data = 100;
        head.next = null;
        head.next = FirstNode;
        FirstNode = head;

        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;

        }
        System.out.println("null");


    }
}
