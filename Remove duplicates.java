
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int removeDuplicates(int[] nums) {
        int  j = 1; 
        int count = 1;
        for(int i=1; i < nums.length; i++){
            if(nums[i-1] == nums[i]){
                count++;
            }
            else{
                count = 1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
        
    }
}