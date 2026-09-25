class Arrays
{

    public static void main(String[] args)
    {
        // int marks[] = {};

        // int age[] = new int[5];

        // for(int x : age)
        // {
        //     System.out.println(x); // 0,0,0,0,0
        // }

        // 1) Directly printing.
        // System.out.println(marks[-1]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);

        // 2) Using for loop.
        for(int i = 0; i < marks.length; i++)
        {
            System.out.print(marks[i] + " ");
        }

        // for(int x : marks)
        // {
        //     System.out.println(x);
        // }
    }
}
