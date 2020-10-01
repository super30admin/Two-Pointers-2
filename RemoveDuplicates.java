
// Time Complexity : O(N) - N is size of the array
// Space Complexity : O(1) - No additional data structure is used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english 
class Solution {
    public int removeDuplicates(int[] nums) {
        int ncount = 1,m = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i - 1]){
                if(ncount < 2){
                    nums[m++] = nums[i];
                }
                ncount++;
            }
            else{
                ncount = 1;
                nums[m++] = nums[i];
            }
        }
        return m;
    }
}
// Your code here along with comments explaining your approach
