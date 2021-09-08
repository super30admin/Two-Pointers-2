//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                count = count + 1;
            }
            else {
                count = 1;
            }
            if(count <= 2) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}