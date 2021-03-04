// TC - O(n), sc - O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        // Initialize i and j pointers
        int i = 1;
        int j = 1;
        int count = 1;
        // j --> slowPtr, i --> fastPtr, j will be holding all allowed k duplicates
        // Iterating loop from 1 to nums.length, if nums[i] is equal to nums[i-1], increment count else count to 1, when count <= 2, nums[j] = nums[i] and increment j as it has k allowed duplicates
        for(i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
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