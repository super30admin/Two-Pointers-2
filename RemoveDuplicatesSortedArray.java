// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int ptr=1, count = 1;
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
            
            if(count <= 2){
                nums[ptr++] = nums[i];
            }
        }
        
        return ptr;
    }
}