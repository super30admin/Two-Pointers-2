
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Time complexity :O(n)
// Space complexity : O(1)
// Did this code successfully run on Leetcode : yes
class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 1;
        int count = 1;
        int j = 1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                count++;
                if(count>2){
                    j++;
                    continue;
                }
            }else{
                count = 1;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }
        return i;
    }
}