public class LessThanZero {
     public static int[] smallerNumbersThanCurrent(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    continue;
                }
                
                if(nums[i] > nums[j])
                {
                    count++;
                }
            }
                nums[i] = count;
        }
        return nums;
     }

        public static void main(String[] args)
        {
            int arr[] = {7, 7, 7, 7};
            int arr1[] = smallerNumbersThanCurrent(arr);
            for(int i : arr)
            {
                System.out.println(i + " ");
            }
        }
}
