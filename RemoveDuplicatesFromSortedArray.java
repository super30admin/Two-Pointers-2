// Time Complexity : O(n), where n is the number of elements in nums.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english



// Your code here along with comments explaining your approach

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)
            return 0; 
        int slow = 1;
        int fast = 1;
        int count = 1;
        while(fast<nums.length){
            if(nums[fast-1]!=nums[fast]){
                count=1;
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
            else{
                if(count<2){
                    nums[slow] = nums[fast];
                    slow++;
                    fast++;
                    count++;
                }
                else{
                    count++;
                    fast++;
                }
            }
        }
        return slow;
    }
}