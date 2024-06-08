//Time complexity - O(n)
//Space Complexity - O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int i = 1;
        int j = 1;
        int count = 1;
        for(i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
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