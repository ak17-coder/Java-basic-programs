public class MethodOverloading
{
    byte max(byte x, byte y)
    {
        if(x > y)
            return x;
        else
            return y;

    }

    // int max(byte x, byte y) // (byte, byte)duplicate variables
    int max(byte x, int y) //  (byte, int)
    {
        if(x > y)
            return x;
        else
            return y;

    }

    int max(int x, int y, int z)
    {
        if(x > y && x > z)
            return x;
        else if(y > x && y > z)
            return y;
        else
            return z;

    }

    float max(float x, float y)
    {
        if(x > y)
            return x;
        else
            return y;

    }
    public static void main(String[] args)
    {
        byte a = 10, b = 15;
        MethodOverloading m = new MethodOverloading();
        System.out.println(m.max(10, 20));
        System.out.println(m.max(a, b));

        System.out.println(m.max(10, 20, 30));

        // System.out.println(m.max(10.0f, 20.0f));

    }
}
