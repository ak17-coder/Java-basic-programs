public class StringBufferAndBuilder
{
    // 1)append
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
    }

    // 2)Insert text at specified index
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(1, "a");
        System.out.println(sb);
    }

    // 3)Deletes chars from begin to end - 1
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4, 16);
        System.out.println(sb);
    }

    // 4)replace
    public static void demoreplace()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    // 5)reverse
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.reverse();
        System.out.println(sb);
    }

    // 6)Capacity
    public static void demoCapacity()
    {
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb.capacity());
    }

    // 7)Ensure Capacity
    public static void demoEnsureCapacity()
    {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
    }

    // 8) Set char At
    public static void demoSetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java");
        sb.setCharAt(0, 'A');
        System.out.println(sb);
    }

    // 9)Set length
    public static void demoSetLength()
    {
        StringBuilder sb = new StringBuilder("Programming");
        sb.setLength(6);
        System.out.println(sb);
    }


    // 10) substring()
    // 11) toString()
    public static void main(String[] args)
    {
        demoAppend();
        demoInsert();
        demoDelete();
        demoreplace();
        demoReverse();
        demoCapacity();
        demoEnsureCapacity();
        demoSetCharAt();
        demoSetLength();
    }
}
