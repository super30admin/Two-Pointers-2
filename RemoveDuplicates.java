/**
 * Time complexity is O(n)
 * space complexity is O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = -1;
        int j = 0;
        
        while(j < nums.length) {
            int curNum = nums[j];
            int count = 1;
            
            j++;
            while(j < nums.length && nums[j] == nums[j-1]) {
                j++;
                count++;
            }
            if(count > 2) {
                count = 2;
            }
            
            while(count > 0) {
                nums[++i] = curNum;
                count--;
            }
        }
        return i+1;
        
    }
}