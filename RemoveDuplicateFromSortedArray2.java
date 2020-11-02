/**
 * TC: O(n) SC: O(1)
 * Approach : Maintain left pointer for the result purpose and right pointer for traversing the array.
 *            check if the counter < 2 and element is same else reset counter and replace the value at left++ value by right
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k = 2;
        int left = 0; 
        int right = 1;
        int count = 1;
        while(right < nums.length){
            if(nums[left] == nums[right] && count < k){
                count++;
                nums[++left] = nums[right];
            }else if(nums[left] != nums[right] ){
                nums[++left] = nums[right];
                count = 1;
            }
            right++;
        }
        return left+1;
    }
}