// Time complexity - O(n)
// Space complexity - O(1)

// check previous element of array and increment count. Swap values if count  is less than 2.

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int count = 1;
        int j = 1;
        for(int  i = 1;i< nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count  <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
