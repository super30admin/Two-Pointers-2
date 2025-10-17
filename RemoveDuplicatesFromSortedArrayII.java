// 80. Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/


/**
 * Time Complexity :  O(n) where n is length of array
 * Space Complexity : O(1) since we dont take any extra space
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        
        int slow = 1;
        
        int count = 1;

        for(int i = 1 ; i < nums.length ; i++){

            if(nums[i] == nums[i - 1]){
                count++;
            }else{
                count = 1;
            }

            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }

        return slow;
    }

}