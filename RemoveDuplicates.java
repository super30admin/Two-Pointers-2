// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english:  Maintain two pointers each on 2nd element of array, if right == right - 1 then increment count
// if count <=2 then increment left and increment right everytime

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int left = 1, right = 1, count = 1;
        
        while(right < nums.length) {
            
            if(nums[right] == nums[right-1]) {
                count++;
            } else {
                count = 1;
            }
            
            if(count <=2) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        
        return left;
    }
}