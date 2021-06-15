
//Time Complexity:O(N)
//Spce Complecity: O(1)

class Solution {
    
    public int removeDuplicates(int[] nums) {
        int j = 1, count = 1;
        for (int i = 1; i < nums.length; i++) {
            
           count = (nums[i] == nums[i - 1]) ? count + 1: 1;
            
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
