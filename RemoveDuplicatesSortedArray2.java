// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : maintain ptr marking the array without duplicates >2. Since array is sorted, all duplicates are next to 
/// each other. For each unique element maintain count =1, inc if duplicates exist and copy them to ptr and inc ptr only if count<=2
/// 
class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=1, idx=1;
        int count = 1;
        for(idx=1;idx<nums.length;idx++){
            if(nums[idx] == nums[idx-1])
            {
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[ptr] = nums[idx];
                ptr++;
            }
        }
        return ptr;
    }
}
