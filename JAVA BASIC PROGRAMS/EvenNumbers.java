public class EvenNumbers
{
    // 1) Pass
    static int makeItHalf(int num)
    {
        num /= 2;
        return num;
    }


    // 2)
    static void makeItHalf(Data myData)
    {
        myData.number = myData.number / 2;
    }

    public static void main(String[] args)
    {
        // 1) Pass by value
        int num = 10;
        num = makeItHalf(num);
        System.out.println(num);


        // 2) Pass by reference
        Data newData = new Data();
        newData.number = 100;

        makeItHalf(newData);
        System.out.println(newData.number);
    }
}
