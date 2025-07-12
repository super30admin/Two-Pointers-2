// Given an array, we return an array with first k integers ordered in such a way that no element appears more than twice
// In this solution, we remove the duplicates in a single pass

class Solution {
    public int removeDuplicates(int[] nums) {
        if ((nums == null) || (nums.length == 0)){
            return 0;
        }
        int count = 1;
        int i = 1;
        int j = 1;
        while(i < nums.length)
        {
            // Check the count of the occurrances
            if(nums[i] == nums[i-1]){
                count = count + 1;
            }
            else{
                count = 1;
            }
            // If count of occurrances is less than or equal to 2, we copy over to the index otherwise discard
            if(count <= 2){
                nums[j] = nums[i];
                j = j + 1;
            }
            i = i + 1;
        }
        return j;
    }
}
