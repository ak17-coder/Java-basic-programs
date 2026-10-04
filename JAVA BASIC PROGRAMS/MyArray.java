public class MyArray
{
    int[] array; // place to store elements
    int length; // length of the array
    int rightIndex; // pointing at empty box

    public MyArray()
    {
        length = 5;
        array = new int[length];
        rightIndex = 0;
    }

    public void insertAtEnd(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        array[rightIndex] = value;
        rightIndex++;
    }

    public void insertAtStart(int value)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        else
        {
            for(int i = rightIndex - 1; i >= 0; i--)
            {
                array[i + 1] = array[i];
            }
            array[0] = value;
            rightIndex++;
        }

    }

    public void insertAtAnyPosition(int value, int position)
    {
        if(rightIndex == length)
        {
            System.out.println("Array is full");
            return;
        }
        if(position < 0 || position > length)
        {
            System.out.println("Invalid position");
        }

        for(int i = rightIndex - 1; i >= position; i--)
        {
            array[i + 1] = array[i];
        }
        array[position] = value;
        rightIndex++;
    }

    public void printElements()
    {
        System.out.println("Index\tValue");
        for(int i = 0; i < length; i++)
        {
            System.out.println(i + "\t" + array[i]);
        }
        System.out.println("size" + rightIndex);
        System.out.println();
    }
}