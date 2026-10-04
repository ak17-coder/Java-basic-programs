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
        myarry.insertAtEnd(50);
        myarry.printElements();


        System.out.println("Insert At Start Array");
        myarry.insertAtStart(50);
        // myarry.insertAtStart(10);
        // myarry.insertAtStart(20);
        // myarry.insertAtStart(30);
        // myarry.insertAtStart(40);
        myarry.printElements();


        System.out.println("Insert At Any position Array");
        myarry.insertAtAnyPosition(30, 2);
        myarry.printElements();

    }
}
