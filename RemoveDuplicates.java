/**
 * Start with 2 pointers both at 1. Maintain count for duplicate element and increase it if previous element is same and reset if not same
 * Replace if the count less 2 duplicates.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        //edge
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count =1;
        int j=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count+=1;
            }else{
                count=1;
            }
            if(count <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}