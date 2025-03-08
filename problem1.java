public class problem1 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int fast=0, slow=0 , count=0, k=2;
        while (fast<n)
        {
            if (fast>0 && nums[fast]== nums[fast-1])
            {
                count++;
            }else {
                count=1;
            }
            if (count<=k)
            {
                nums[slow]= nums[fast];
                slow++;
             //   fast++;
            }

                fast++;

        }
        return slow;
    }
}
