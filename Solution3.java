// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution3 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int cnt = 1, i = 1, j = 1;
        while(i < nums.length){
            if(nums[i] == nums[i - 1]){
                cnt++;
            }
            else {
                cnt = 1;
            }
            if(cnt <= 2){
                nums[j] = nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}