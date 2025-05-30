//keep variable count to check the freq of each number
//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int count = 1;
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            if(nums[j] == nums[i]) count++;
            else count = 1;
            if(count <= k) {
                i++;
                nums[i] = nums[j];
            }
            else continue;
        }
        return i+1;
    }
}