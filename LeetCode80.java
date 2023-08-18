
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;

        int slow =0,count=1;

        for(int fast = 1; fast<n;fast++)
        {
            if(nums[fast] == nums[fast-1])
            {
                count++;
            }
            else
            count=1;
            if(count<=2)
            {
                slow++;
                nums[slow]=nums[fast];
            }
        }
    return slow+1;
        
    }
}