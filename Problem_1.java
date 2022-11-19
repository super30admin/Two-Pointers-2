// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//making use of the sorted array and taking 2 pointers, starting from index 1.
//checking if previous index contains same element, if yes increasing count to 2 and if no, resetting count to 1.
//checking if count is greater than 2, if yes then we already have the elements needed and no action needed if no, then copying index i value in index j
//at the end, array till index j will have result with at max 2 duplicate values 

// Your code here along with comments explaining your approach

//80. Remove Duplicates from Sorted Array II
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int n = nums.length;
        int j = 1;
        int count = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i - 1]){
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