public class SinglyLinkedList
{

    public static void main(String[] args)
    {
        Node newNode = new Node();
        Node SecondNode = new Node();
        Node ThirdNode = new Node();

        ThirdNode.data = 103;
        ThirdNode.next = null;

        SecondNode.data = 102;
        SecondNode.next = ThirdNode;

        newNode.data = 101;
        newNode.next = ThirdNode;

        // System.out.println(newNode.data);
        System.out.println(newNode.next.data);

        // System.out.println(newNode.next.next.next); // Null pointer exception.


        System.out.println(SecondNode.data);
        System.out.println(SecondNode.next);

        System.out.println(ThirdNode.next);
        System.out.println(ThirdNode.next);
    }
}
