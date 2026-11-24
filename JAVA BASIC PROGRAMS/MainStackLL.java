
public class MainStackLL
{
    public static void main(String[] args)
    {

        StackLL st = new StackLL();

        System.out.println("-------");
        System.out.println("Initially");
        System.out.println("-------");

        st.display();

        System.out.println();
        System.out.println("Is empty? " + st.isEmpty());

        System.out.println("Push");
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println();

        st.display();

        System.out.println("\n\nPeek");
        System.out.println("Top element : " + st.peek());

        System.out.println("------");
        System.out.println("Peek by position");
        System.out.println("------");

        System.out.println("Pos1 : " + st.peek1(1));
        System.out.println("Pos2 : " + st.peek1(2));
        System.out.println("Pos3 : " + st.peek1(3));
        System.out.println("Pos4 : " + st.peek1(4));
        System.out.println("Pos5 : " + st.peek1(5));


        System.out.println("\nPop");
        System.out.println("Popped : " + st.pop());

        System.out.println();

        st.display();

        System.out.println("\n\nTop after pop");

        System.out.println("Top element : " + st.peek());


        System.out.println("\nPop remaining elements");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        System.out.println();

        st.display();

        System.out.println("\nIs empty?" + st.isEmpty() );


    }
}
