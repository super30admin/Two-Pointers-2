// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int c = 1;
        int j = 0;
        while(j<nums.length){
            if(i > 0 && nums[j] != nums[i-1]) c = 1;
            if(c < 3 ){
                nums[i] = nums[j];
                i++;
                c = c+1; 
            }
            j++;
        } 
        return i;
    }
}
