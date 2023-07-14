// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        int fast = 0;
        int count = 0;
        int duplicatesAllowed = 1;
        while(fast < nums.length)
        {
            if(fast!=0 && nums[fast] != nums[fast-1])
                count = 1;
            else count++;

            if(count <= duplicatesAllowed)
            {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
