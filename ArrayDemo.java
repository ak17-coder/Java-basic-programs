

public class ArrayDemo
{
    public static void main(String[] args)
    {
        MyArray myarry = new MyArray();

        System.out.println("Initial Array");
        myarry.printElements();

        System.out.println("Insert At End Array");
        myarry.insertAtEnd(10);
        myarry.insertAtEnd(20);
        myarry.insertAtEnd(30);
        myarry.insertAtEnd(40);
        // myarry.insertAtEnd(50);
        myarry.printElements();

        // System.out.println("Delete At End");
        // myarry.deleteFromEnd();
        // myarry.printElements();

        System.out.println("Delete At Start");
        myarry.deleteFromStart();
        myarry.printElements();

        System.out.println("Delete At any position");
        myarry.deleteAtAnyPosition(1);
        myarry.printElements();


    }
}
