public class StudentsPassed
{
    public static int getCountOfStudentPassed(int arr[])
    {
        if(arr == null || arr.length == 0)
            return -1;

        int count = 0;

        for(int x : arr)
        {
            if(x >= 35)
                count++;
        }

        return count;
    }
    public static void main(String[] args)
    {
        int arr[] = {40, 35, 27, 90, 10};

        int res = getCountOfStudentPassed(arr);
        System.out.println(res);
    }
}
