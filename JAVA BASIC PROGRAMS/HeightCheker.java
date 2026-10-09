public class HeightCheker {
    public static int heightChecker(int[] heights)
    {
        int count = 0;
        int arr[] = heights.clone();

        for(int i = 0; i < heights.length; i++)
        {
            for(int j = i + 1; j < heights.length; j++)
            {
                if(i == j)
                    continue;
                if(heights[i] > heights[j])
                {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }

        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != heights[i])
            {
                count++;
            }

        }
        // for(int x : arr)
        // {
        //     System.out.print(x + " ");
        // }
        return count;
    }

    public static void main(String[] args)
    {
        int heights[] = {1, 1, 4, 2, 1, 3};
        int cnt = heightChecker(heights);
        System.out.println(cnt);
    }
}
