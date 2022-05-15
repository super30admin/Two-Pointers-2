
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Using slowPointer and fastPointer. And maintaining the duplicate count, if it is less than our k, then overriding slowPointer value


public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int slowPointer = 1;
        int fastPointer = 1;
        int count = 1;
        while(fastPointer < nums.length){
            if(nums[fastPointer-1] != nums[fastPointer])
                count = 1;
            else
                count++;
            if(count <= k){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
            fastPointer++;
        }
        return slowPointer;
    }
}
