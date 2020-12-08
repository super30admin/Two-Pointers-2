/*
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0
        
        count = 1
        j = 1
        
        for i in range(1, len(nums)):
            if nums[i] == nums[i-1]:
                count += 1
            else:
                count = 1
                
            if count <= 2:
                nums[j] = nums[i]
                j += 1
        
        return j
*/


// Time Complexity : O(n) where n is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach: I maintained j pointer whenever count is less than 2 I would just replace
// value at j with i

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length== 0){
            return 0;
        }
        
        int count = 1, j = 1;
        
        for (int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                count ++;
            }
            else{
                count = 1;
            }
            if (count <= 2){
                nums[j] = nums[i];
                j ++;
            }
        }
        return j;
    }
}